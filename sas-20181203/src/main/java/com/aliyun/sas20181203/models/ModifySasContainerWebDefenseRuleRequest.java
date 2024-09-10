// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifySasContainerWebDefenseRuleRequest extends TeaModel {
    /**
     * <p>The paths that are protected.</p>
     */
    @NameInMap("PathConfDTOList")
    public java.util.List<ModifySasContainerWebDefenseRuleRequestPathConfDTOList> pathConfDTOList;

    /**
     * <p>The ID of the rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>200634</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The name of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>wwwwwww</p>
     */
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
        /**
         * <p>The backup paths.</p>
         * 
         * <strong>example:</strong>
         * <p>/tmp/test</p>
         */
        @NameInMap("BackupPath")
        public String backupPath;

        /**
         * <p>The prevention mode. Valid values:</p>
         * <ul>
         * <li><strong>block</strong></li>
         * <li><strong>audit</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>audit</p>
         */
        @NameInMap("DefenseMode")
        public String defenseMode;

        /**
         * <p>The path that is protected.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/test/home/</p>
         */
        @NameInMap("DefensePath")
        public String defensePath;

        /**
         * <p>The files that are excluded.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/test</p>
         */
        @NameInMap("ExcludeFile")
        public String excludeFile;

        /**
         * <p>The paths to the files that are excluded.</p>
         * 
         * <strong>example:</strong>
         * <p>/test/home/qq</p>
         */
        @NameInMap("ExcludeFilePath")
        public String excludeFilePath;

        /**
         * <p>The types of the files that are excluded.</p>
         * 
         * <strong>example:</strong>
         * <p>php</p>
         */
        @NameInMap("ExcludeFileType")
        public String excludeFileType;

        /**
         * <p>The protection mode. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: basic mode (whitelist)</li>
         * <li><strong>1</strong>: complex mode (blacklist)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("GuardType")
        public Integer guardType;

        /**
         * <p>The files that are included.</p>
         * 
         * <strong>example:</strong>
         * <p>/home/admin/test</p>
         */
        @NameInMap("IncludeFile")
        public String includeFile;

        /**
         * <p>The type of the files that are included.</p>
         * 
         * <strong>example:</strong>
         * <p>jsp</p>
         */
        @NameInMap("IncludeFileType")
        public String includeFileType;

        /**
         * <p>The path ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("PathConfId")
        public Long pathConfId;

        /**
         * <p>The processes that are added to the whitelist.</p>
         */
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
