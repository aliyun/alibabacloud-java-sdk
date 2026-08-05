// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class CreateWorkspaceRequest extends TeaModel {
    /**
     * <p>Billing type</p>
     * <ul>
     * <li>POSTPAY: Pay-as-you-go</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("chargeType")
    public String chargeType;

    /**
     * <p>Engine type</p>
     * <ul>
     * <li>rag</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rag</p>
     */
    @NameInMap("engineType")
    public String engineType;

    /**
     * <p>Workspace name</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Quota</p>
     */
    @NameInMap("quota")
    public CreateWorkspaceRequestQuota quota;

    /**
     * <p>Type</p>
     * <ul>
     * <li>standard</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("type")
    public String type;

    public static CreateWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceRequest self = new CreateWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateWorkspaceRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public CreateWorkspaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateWorkspaceRequest setQuota(CreateWorkspaceRequestQuota quota) {
        this.quota = quota;
        return this;
    }
    public CreateWorkspaceRequestQuota getQuota() {
        return this.quota;
    }

    public CreateWorkspaceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateWorkspaceRequestQuota extends TeaModel {
        /**
         * <p>Compute resource (unit: LCU)</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("computeResource")
        public Integer computeResource;

        /**
         * <p>Storage capacity (unit: GB)</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("docSize")
        public Integer docSize;

        /**
         * <p>Specification</p>
         * <ul>
         * <li>rag.share.common</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rag.share.common</p>
         */
        @NameInMap("spec")
        public String spec;

        public static CreateWorkspaceRequestQuota build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceRequestQuota self = new CreateWorkspaceRequestQuota();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceRequestQuota setComputeResource(Integer computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public Integer getComputeResource() {
            return this.computeResource;
        }

        public CreateWorkspaceRequestQuota setDocSize(Integer docSize) {
            this.docSize = docSize;
            return this;
        }
        public Integer getDocSize() {
            return this.docSize;
        }

        public CreateWorkspaceRequestQuota setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

}
