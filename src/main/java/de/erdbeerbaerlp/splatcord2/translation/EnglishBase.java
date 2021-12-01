package de.erdbeerbaerlp.splatcord2.translation;

import de.erdbeerbaerlp.splatcord2.storage.Config;

/**
 * Using english as base, extend other localizations from this class
 */
public class EnglishBase {

    public String salmonStage = "Stages:",
            weapons = "Weapons:",
            stagesTitle = "Current Stages",
            futureStagesTitle = "Future Stages",
            footer_ends = "Ends",
            footer_starts = "Starts",
            footer_closed = "Closed",
            salmonRunTitle = "Salmon Run",
            unknownCommand = "Unknown command",
            noAdminPerms = "You need administrative permissions (manage server) to execute this command!",
            stageFeedMsg = "New stage rotations will now be sent here",
            salmonFeedMsg = "New Salmon Runs will now be sent here",
            languageSetMessage = "Your server's language is now set to english",
            unknownLanguage = "You did not specify an valid language, valid languages are german (de), english (en), and italian (it)",
            deleteSuccessful = "Successfully deleted",
            noWritePerms = "This bot has no permission to write in the target channel",
            skill = "Skill:",
            price = "Price:",
            skillSlots = "Skill Slots:",
            splatNetShop = "SplatNet Gear Shop",
            splatnetCooldown = "The SplatNet command is currently on cooldown. Please try again in a few minutes.",
            legacyCommand = "You are attempting to use an legacy command, which is no longer possible!\n" +
                    "Use the slash commands instead" +
                    "If you are server admin and this server cannot use the slash commands yet, open <https://discord.com/api/oauth2/authorize?client_id=822228767165644872&scope=applications.commands> and select this server. After doing this run " + Config.instance().discord.prefix + "fixslashcommands",
            cmdFixSlashCommands = "Slash commands should work soon now!\n" +
                    "If that is not the case, contact the bot developer",
            cmdSetlangDesc = "Changes the bot language for this server",
            cmdInviteDesc = "Gives you the invite URL for this bot",
            cmdSetstageDesc = "Marks this channel as the stage notification channel",
            cmdDelstageDesc = "Deletes the set stage notification channel",
            cmdSetsalmonDesc = "Marks this channel as the salmon run notification channel",
            cmdDelsalmonDesc = "Deletes the currently set SalmonRun channel",
            cmdCodeDesc = "Generates an random private battle code",
            cmdCodeArgDesc = "Hide code from others? (Default: show)",
            cmdRotationDesc = "Sends the currently active stages plus the next two rotations",
            cmdSupportDesc = "Gives you the invite link for the discord server of the bot",
            cmdRandomDesc = "Generates random stuff",
            cmdRandomAmountDesc = "Amount to generate (default=1, max=10)",
            cmdRandomWeaponDesc = "Generate random weapon(s)",
            cmdRandomStageDesc = "Generate random stage(s)",
            cmdSalmonDesc = "Shows current and next salmon run",
            cmdSplatnetDesc = "Shows what is currently available on SplatNet Gear Shop",
            databaseError = "The database is currently down. If this issue persists, contact developer", //Never shows up in other languages
            cmdStatusDB = "Database",
            online = "Online",
            offline = "Offline",
            cmdStatusDesc = "Shows bot status and statistics",
            cmdStatusStats = "Statistics",
            cmdStatusStatsServers = "Servers: ",
            cmdStatusStatsUptime = "Uptime: ",
            cmdStatusStatsDbUptime = "Database-Uptime: ",
            cmdProfileDesc = "Shows or edits your Splatoon profile(s)", //Should not show up anyway
            cmdProfile1Desc = "Shows or edits your Splatoon 1 profile",
            cmdProfile2Desc = "Shows or edits your Splatoon 2 profile",
            cmdProfile3Desc = "Shows or edits your Splatoon 3 profile",
            cmdProfilennidErr = "Cannot use profile feature without setting Nintendo Network ID or Pretendo Network ID!",
            cmdProfilefcErr = "Cannot use profile feature without setting your Switch friend code!",
            cmdProfileRankFormatNotValid = "Rank format is not valid!",
            cmdProfileS1RankSet = "Your Splatoon 1 rank was set to %rank%",
            cmdProfileS2RankSet = "Your %mode% rank was set to %rank%",
            cmdProfileS2SalmonSet = "Your Salmon Run title was set to %title%",
            cmdProfileSwitchFCDesc = "Your Switch Friend Code",
            cmdProfileNNIDDesc = "Your Nintendo Network ID",
            cmdProfilePNIDDesc = "Your Pretendo Network ID",
            cmdProfileLevelDesc = "Your in-game level",
            cmdProfileNameDesc = "Your in-game name",
            cmdProfileRankDesc = "Your Splatoon Rank (Examples: C-, B, A+ 20, S+99)",
            cmdProfileRank2Desc = "Your Splatoon 2 %mode% Rank (Examples: C-, B, S+4, X 2000)",
            salmonRunTitleUnset = "Intern",
            salmonRunTitleApprentice = "Apprentice",
            salmonRunTitlePartTimer = "Part-Timer",
            salmonRunTitleGoGetter = "Go-Getter",
            salmonRunTitleOverachiever = "Overachiever",
            salmonRunTitleProfreshional = "Profreshional",
            cmdProfileRank = "Rank",
            cmdProfileLevel = "Level",
            cmdProfileSRTitleDesc = "Your Salmon Run Title",
            cmdProfileSRTitle = "Salmon Run Title",
            cmdProfileNameErr = "Name too long! Can only be 10 characters!",
            cmdProfileLevel1Set = "Splatoon 1 level set to ",
            cmdProfileLevel2Set = "Splatoon 2 level set to ",
            cmdProfileNameSet = "In-Game name set to ",
            cmdProfileMissingNID = "You did not configure an Nintendo Network ID or an Pretendo Network ID yet.",
            cmdProfileMissingFC = "You did not configure an Switch Friend Code yet.",
            cmdProfileFCSet = "Set Friend Code to ";
}
