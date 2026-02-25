// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class WorkspaceSpec extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("CodeType")
    public String codeType;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsGuaranteedValid")
    public Boolean isGuaranteedValid;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsOverSoldValid")
    public Boolean isOverSoldValid;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Reason")
    public String reason;

    @NameInMap("Spec")
    public ResourceAmount spec;

    /**
     * <strong>example:</strong>
     * <p>spec_test</p>
     */
    @NameInMap("SpecName")
    public String specName;

    public static WorkspaceSpec build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceSpec self = new WorkspaceSpec();
        return TeaModel.build(map, self);
    }

    public WorkspaceSpec setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public WorkspaceSpec setCodeType(String codeType) {
        this.codeType = codeType;
        return this;
    }
    public String getCodeType() {
        return this.codeType;
    }

    public WorkspaceSpec setIsGuaranteedValid(Boolean isGuaranteedValid) {
        this.isGuaranteedValid = isGuaranteedValid;
        return this;
    }
    public Boolean getIsGuaranteedValid() {
        return this.isGuaranteedValid;
    }

    public WorkspaceSpec setIsOverSoldValid(Boolean isOverSoldValid) {
        this.isOverSoldValid = isOverSoldValid;
        return this;
    }
    public Boolean getIsOverSoldValid() {
        return this.isOverSoldValid;
    }

    public WorkspaceSpec setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public WorkspaceSpec setSpec(ResourceAmount spec) {
        this.spec = spec;
        return this;
    }
    public ResourceAmount getSpec() {
        return this.spec;
    }

    public WorkspaceSpec setSpecName(String specName) {
        this.specName = specName;
        return this;
    }
    public String getSpecName() {
        return this.specName;
    }

}
