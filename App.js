import {createAppContainer} from 'react-navigation';
import {createStackNavigator} from 'react-navigation-stack';
import HomeScreen from './Home';
import ProfileScreen from './Profile';
import DemoViewScreen from './DemoView';

const MainNavigator = createStackNavigator({
  Home: {screen: HomeScreen},
  Profile: {screen: ProfileScreen},
  DemoView: {screen: DemoViewScreen},
});

const App = createAppContainer(MainNavigator);

export default App;
