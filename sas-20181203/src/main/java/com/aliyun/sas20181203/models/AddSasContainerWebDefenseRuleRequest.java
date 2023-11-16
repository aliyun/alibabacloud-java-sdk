// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddSasContainerWebDefenseRuleRequest extends TeaModel {
    @NameInMap("PathConfDTOList")
    public java.util.List<AddSasContainerWebDefenseRuleRequestPathConfDTOList> pathConfDTOList;

    @NameInMap("RuleName")
    public String ruleName;

    public static AddSasContainerWebDefenseRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSasContainerWebDefenseRuleRequest self = new AddSasContainerWebDefenseRuleRequest();
        return TeaModel.build(map, self);
    }

    public AddSasContainerWebDefenseRuleRequest setPathConfDTOList(java.util.List<AddSasContainerWebDefenseRuleRequestPathConfDTOList> pathConfDTOList) {
        this.pathConfDTOList = pathConfDTOList;
        return this;
    }
    public java.util.List<AddSasContainerWebDefenseRuleRequestPathConfDTOList> getPathConfDTOList() {
        return this.pathConfDTOList;
    }

    public AddSasContainerWebDefenseRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public static class AddSasContainerWebDefenseRuleRequestPathConfDTOList extends TeaModel {
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

        @NameInMap("ProcessPathList")
        public java.util.List<String> processPathList;

        public static AddSasContainerWebDefenseRuleRequestPathConfDTOList build(java.util.Map<String, ?> map) throws Exception {
            AddSasContainerWebDefenseRuleRequestPathConfDTOList self = new AddSasContainerWebDefenseRuleRequestPathConfDTOList();
            return TeaModel.build(map, self);
        }

        public AddSasContainerWebDefenseRuleRequestPathConfDTOList setBackupPath(String backupPath) {
            this.backupPath = backupPath;
            return this;
        }
        public String getBackupPath() {
            return this.backupPath;
        }

        public AddSasContainerWebDefenseRuleRequestPathConfDTOList setDefenseMode(String defenseMode) {
            this.defenseMode = defenseMode;
            return this;
        }
        public String getDefenseMode() {
            return this.defenseMode;
        }

        public AddSasContainerWebDefenseRuleRequestPathConfDTOList setDefensePath(String defensePath) {
            this.defensePath = defensePath;
            return this;
        }
        public String getDefensePath() {
            return this.defensePath;
        }

        public AddSasContainerWebDefenseRuleRequestPathConfDTOList setExcludeFile(String excludeFile) {
            this.excludeFile = excludeFile;
            return this;
        }
        public String getExcludeFile() {
            return this.excludeFile;
        }

        public AddSasContainerWebDefenseRuleRequestPathConfDTOList setExcludeFilePath(String excludeFilePath) {
            this.excludeFilePath = excludeFilePath;
            return this;
        }
        public String getExcludeFilePath() {
            return this.excludeFilePath;
        }

        public AddSasContainerWebDefenseRuleRequestPathConfDTOList setExcludeFileType(String excludeFileType) {
            this.excludeFileType = excludeFileType;
            return this;
        }
        public String getExcludeFileType() {
            return this.excludeFileType;
        }

        public AddSasContainerWebDefenseRuleRequestPathConfDTOList setGuardType(Integer guardType) {
            this.guardType = guardType;
            return this;
        }
        public Integer getGuardType() {
            return this.guardType;
        }

        public AddSasContainerWebDefenseRuleRequestPathConfDTOList setIncludeFile(String includeFile) {
            this.includeFile = includeFile;
            return this;
        }
        public String getIncludeFile() {
            return this.includeFile;
        }

        public AddSasContainerWebDefenseRuleRequestPathConfDTOList setIncludeFileType(String includeFileType) {
            this.includeFileType = includeFileType;
            return this;
        }
        public String getIncludeFileType() {
            return this.includeFileType;
        }

        public AddSasContainerWebDefenseRuleRequestPathConfDTOList setProcessPathList(java.util.List<String> processPathList) {
            this.processPathList = processPathList;
            return this;
        }
        public java.util.List<String> getProcessPathList() {
            return this.processPathList;
        }

    }

}
