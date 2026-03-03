// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PbcRelationItem extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>企业服务</p>
     */
    @NameInMap("company")
    public String company;

    /**
     * <strong>example:</strong>
     * <p>中驿</p>
     */
    @NameInMap("developer")
    public String developer;

    /**
     * <strong>example:</strong>
     * <p>category</p>
     */
    @NameInMap("pbcName")
    public String pbcName;

    /**
     * <strong>example:</strong>
     * <p>2022-04-01T00:00:00.000Z</p>
     */
    @NameInMap("pbcVersion")
    public String pbcVersion;

    /**
     * <strong>example:</strong>
     * <p>资产市场</p>
     */
    @NameInMap("summary")
    public String summary;

    public static PbcRelationItem build(java.util.Map<String, ?> map) throws Exception {
        PbcRelationItem self = new PbcRelationItem();
        return TeaModel.build(map, self);
    }

    public PbcRelationItem setCompany(String company) {
        this.company = company;
        return this;
    }
    public String getCompany() {
        return this.company;
    }

    public PbcRelationItem setDeveloper(String developer) {
        this.developer = developer;
        return this;
    }
    public String getDeveloper() {
        return this.developer;
    }

    public PbcRelationItem setPbcName(String pbcName) {
        this.pbcName = pbcName;
        return this;
    }
    public String getPbcName() {
        return this.pbcName;
    }

    public PbcRelationItem setPbcVersion(String pbcVersion) {
        this.pbcVersion = pbcVersion;
        return this;
    }
    public String getPbcVersion() {
        return this.pbcVersion;
    }

    public PbcRelationItem setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

}
