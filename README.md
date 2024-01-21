# SwiftBite

SwiftBite changes the fishing mechanics with Customizable Lure Speeds. This plugin offers server admins control over fishing lure speeds, allowing for a personalized and engaging fishing experience. Fine-tune fishing to your liking and keep your players hooked! Download the latest build [here](https://www.spigotmc.org/resources/swiftbite-fishing.114440/).

![SwiftBite Fishing](https://i.imgur.com/45HdisL.gif)

## Key Features

- **Custom Lure Speeds:** Configure specific speeds for different lure levels.
- **Easy Configuration:** Simple YAML configuration for quick setup.
- **Server Performance Friendly:** Plugin has minimal impact on server performance.

## Configuration Example

```yaml
lure-speeds:
  level1:
    min-wait-time: 80
    max-wait-time: 500
  level2:
    min-wait-time: 60
    max-wait-time: 400
  level3:
    min-wait-time: 40
    max-wait-time: 300
```

## How to Use

1. Place the plugin JAR file in your server's plugins folder.
2. Restart your server to generate the default configuration file.
3. Edit the `config.yml` to set your desired lure speeds.
4. Reload the plugin or restart your server to apply changes.
