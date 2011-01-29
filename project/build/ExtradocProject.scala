import sbt._
import com.github.retronym.OneJarProject

class ExtradocProject(info: ProjectInfo) extends DefaultProject(info) with OneJarProject 
{
  override def compileOptions = Deprecation :: super.compileOptions.toList
  override def mainClass = Some("com.novocode.extradoc.ExtraDoc")
}
