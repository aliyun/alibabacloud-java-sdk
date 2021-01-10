// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportClriskTemplateRequest extends TeaModel {
    @NameInMap("Imports")
    public java.util.List<ImportClriskTemplateRequestImports> imports;

    public static ImportClriskTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportClriskTemplateRequest self = new ImportClriskTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ImportClriskTemplateRequest setImports(java.util.List<ImportClriskTemplateRequestImports> imports) {
        this.imports = imports;
        return this;
    }
    public java.util.List<ImportClriskTemplateRequestImports> getImports() {
        return this.imports;
    }

    public static class ImportClriskTemplateRequestImports extends TeaModel {
        @NameInMap("DataNodes")
        public String dataNodes;

        @NameInMap("IsModify")
        public Boolean isModify;

        @NameInMap("ModelCode")
        public String modelCode;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owners")
        public String owners;

        @NameInMap("ProductId")
        public Long productId;

        @NameInMap("RuleCodes")
        public String ruleCodes;

        @NameInMap("RuleNames")
        public String ruleNames;

        @NameInMap("TemplateCode")
        public String templateCode;

        @NameInMap("TemplateRuleCodes")
        public String templateRuleCodes;

        public static ImportClriskTemplateRequestImports build(java.util.Map<String, ?> map) throws Exception {
            ImportClriskTemplateRequestImports self = new ImportClriskTemplateRequestImports();
            return TeaModel.build(map, self);
        }

        public ImportClriskTemplateRequestImports setDataNodes(String dataNodes) {
            this.dataNodes = dataNodes;
            return this;
        }
        public String getDataNodes() {
            return this.dataNodes;
        }

        public ImportClriskTemplateRequestImports setIsModify(Boolean isModify) {
            this.isModify = isModify;
            return this;
        }
        public Boolean getIsModify() {
            return this.isModify;
        }

        public ImportClriskTemplateRequestImports setModelCode(String modelCode) {
            this.modelCode = modelCode;
            return this;
        }
        public String getModelCode() {
            return this.modelCode;
        }

        public ImportClriskTemplateRequestImports setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ImportClriskTemplateRequestImports setOwners(String owners) {
            this.owners = owners;
            return this;
        }
        public String getOwners() {
            return this.owners;
        }

        public ImportClriskTemplateRequestImports setProductId(Long productId) {
            this.productId = productId;
            return this;
        }
        public Long getProductId() {
            return this.productId;
        }

        public ImportClriskTemplateRequestImports setRuleCodes(String ruleCodes) {
            this.ruleCodes = ruleCodes;
            return this;
        }
        public String getRuleCodes() {
            return this.ruleCodes;
        }

        public ImportClriskTemplateRequestImports setRuleNames(String ruleNames) {
            this.ruleNames = ruleNames;
            return this;
        }
        public String getRuleNames() {
            return this.ruleNames;
        }

        public ImportClriskTemplateRequestImports setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public ImportClriskTemplateRequestImports setTemplateRuleCodes(String templateRuleCodes) {
            this.templateRuleCodes = templateRuleCodes;
            return this;
        }
        public String getTemplateRuleCodes() {
            return this.templateRuleCodes;
        }

    }

}
