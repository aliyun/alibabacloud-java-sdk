// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifySasContainerWebDefenseRuleRequest extends TeaModel {
    @NameInMap("PathConfDTOList")
    public java.util.List<ModifySasContainerWebDefenseRuleRequestPathConfDTOList> pathConfDTOList;

    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("RuleName")
    public String ruleName;

    public static ModifySasContainerWebDefenseRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySasContainerWebDefenseRuleRequest self = new ModifySasContainerWebDefenseRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifySasContainerWebDefenseRuleRequest setPathConfDTOList(java.util.List<ModifySasContainerWebDefenseRuleRequestPathConfDTOList> pathConfDTOList) {
        this.pathConfDTOList = pathConfDTOList;
        return this;
    }
    public java.util.List<ModifySasContainerWebDefenseRuleRequestPathConfDTOList> getPathConfDTOList() {
        return this.pathConfDTOList;
    }

    public ModifySasContainerWebDefenseRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public ModifySasContainerWebDefenseRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public static class ModifySasContainerWebDefenseRuleRequestPathConfDTOList extends TeaModel {
        @NameInMap("BackupPath")
        public String backupPath;

        @NameInMap("DefenseMode")
        public String defenseMode;

        @NameInMap("DefensePath")
        public String defensePath;

        @NameInMap("ExcludeFile")
        public String excludeFile;

        @NameInMap("ExcludeFilePath")
        public String excludeFilePath;

        @NameInMap("ExcludeFileType")
        public String excludeFileType;

        @NameInMap("GuardType")
        public Integer guardType;

        @NameInMap("IncludeFile")
        public String includeFile;

        @NameInMap("IncludeFileType")
        public String includeFileType;

        @NameInMap("PathConfId")
        public Long pathConfId;

        @NameInMap("ProcessPathList")
        public java.util.List<String> processPathList;

        public static ModifySasContainerWebDefenseRuleRequestPathConfDTOList build(java.util.Map<String, ?> map) throws Exception {
            ModifySasContainerWebDefenseRuleRequestPathConfDTOList self = new ModifySasContainerWebDefenseRuleRequestPathConfDTOList();
            return TeaModel.build(map, self);
        }

        public ModifySasContainerWebDefenseRuleRequestPathConfDTOList setBackupPath(String backupPath) {
            this.backupPath = backupPath;
            return this;
        }
        public String getBackupPath() {
            return this.backupPath;
        }

        public ModifySasContainerWebDefenseRuleRequestPathConfDTOList setDefenseMode(String defenseMode) {
            this.defenseMode = defenseMode;
            return this;
        }
        public String getDefenseMode() {
            return this.defenseMode;
        }

        public ModifySasContainerWebDefenseRuleRequestPathConfDTOList setDefensePath(String defensePath) {
            this.defensePath = defensePath;
            return this;
        }
        public String getDefensePath() {
            return this.defensePath;
        }

        public ModifySasContainerWebDefenseRuleRequestPathConfDTOList setExcludeFile(String excludeFile) {
            this.excludeFile = excludeFile;
            return this;
        }
        public String getExcludeFile() {
            return this.excludeFile;
        }

        public ModifySasContainerWebDefenseRuleRequestPathConfDTOList setExcludeFilePath(String excludeFilePath) {
            this.excludeFilePath = excludeFilePath;
            return this;
        }
        public String getExcludeFilePath() {
            return this.excludeFilePath;
        }

        public ModifySasContainerWebDefenseRuleRequestPathConfDTOList setExcludeFileType(String excludeFileType) {
            this.excludeFileType = excludeFileType;
            return this;
        }
        public String getExcludeFileType() {
            return this.excludeFileType;
        }

        public ModifySasContainerWebDefenseRuleRequestPathConfDTOList setGuardType(Integer guardType) {
            this.guardType = guardType;
            return this;
        }
        public Integer getGuardType() {
            return this.guardType;
        }

        public ModifySasContainerWebDefenseRuleRequestPathConfDTOList setIncludeFile(String includeFile) {
            this.includeFile = includeFile;
            return this;
        }
        public String getIncludeFile() {
            return this.includeFile;
        }

        public ModifySasContainerWebDefenseRuleRequestPathConfDTOList setIncludeFileType(String includeFileType) {
            this.includeFileType = includeFileType;
            return this;
        }
        public String getIncludeFileType() {
            return this.includeFileType;
        }

        public ModifySasContainerWebDefenseRuleRequestPathConfDTOList setPathConfId(Long pathConfId) {
            this.pathConfId = pathConfId;
            return this;
        }
        public Long getPathConfId() {
            return this.pathConfId;
        }

        public ModifySasContainerWebDefenseRuleRequestPathConfDTOList setProcessPathList(java.util.List<String> processPathList) {
            this.processPathList = processPathList;
            return this;
        }
        public java.util.List<String> getProcessPathList() {
            return this.processPathList;
        }

    }

}
