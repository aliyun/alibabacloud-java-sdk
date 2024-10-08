// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddSasContainerWebDefenseRuleRequest extends TeaModel {
    /**
     * <p>The paths that you want to protect.</p>
     */
    @NameInMap("PathConfDTOList")
    public java.util.List<AddSasContainerWebDefenseRuleRequestPathConfDTOList> pathConfDTOList;

    /**
     * <p>The name of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>test-2020</p>
     */
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
        /**
         * <p>The backup path.</p>
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
         * 
         * <strong>example:</strong>
         * <p>audit</p>
         */
        @NameInMap("DefenseMode")
        public String defenseMode;

        /**
         * <p>The path that you want to protect.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/test/</p>
         */
        @NameInMap("DefensePath")
        public String defensePath;

        /**
         * <p>The file that you want to exclude.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/test/aa</p>
         */
        @NameInMap("ExcludeFile")
        public String excludeFile;

        /**
         * <p>The path to the file that you want to exclude.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/test/tt</p>
         */
        @NameInMap("ExcludeFilePath")
        public String excludeFilePath;

        /**
         * <p>The type of the file that you want to exclude.</p>
         * 
         * <strong>example:</strong>
         * <p>jsp</p>
         */
        @NameInMap("ExcludeFileType")
        public String excludeFileType;

        /**
         * <p>The protecion mode. Valid values:</p>
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
         * <p>The file that you want to include.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/test/t1</p>
         */
        @NameInMap("IncludeFile")
        public String includeFile;

        /**
         * <p>The type of the file that you want to include.</p>
         * 
         * <strong>example:</strong>
         * <p>*.jsp</p>
         */
        @NameInMap("IncludeFileType")
        public String includeFileType;

        /**
         * <p>The processes that you want to add to the whitelist.</p>
         * <p>This parameter is required.</p>
         */
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
