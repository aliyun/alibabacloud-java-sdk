// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpPbc extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>基础商品</p>
     */
    @NameInMap("alias")
    public String alias;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>多端商城</p>
     */
    @NameInMap("company")
    public String company;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("companyId")
    public Long companyId;

    /**
     * <strong>example:</strong>
     * <p>基础商品描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("developerId")
    public String developerId;

    /**
     * <strong>example:</strong>
     * <p>neuron-pdp-pbc</p>
     */
    @NameInMap("gitGroup")
    public String gitGroup;

    /**
     * <strong>example:</strong>
     * <p>{&quot;path&quot;:&quot;neuron-pdp-pbc&quot;,&quot;webUrl&quot;:&quot;<a href="https://codeup.aliyun.com/616d751bbc23ecd311af9711/neuron-pdp-pbc%22,%22name%22:%22neuron-pdp-pbc%22,%22id%22:480037,%22ownerId%22:663171,%22pathWithNamespace%22:%22616d751bbc23ecd311af9711/neuron-pdp-pbc%22,%22parentId%22:330007%7D">https://codeup.aliyun.com/616d751bbc23ecd311af9711/neuron-pdp-pbc&quot;,&quot;name&quot;:&quot;neuron-pdp-pbc&quot;,&quot;id&quot;:480037,&quot;ownerId&quot;:663171,&quot;pathWithNamespace&quot;:&quot;616d751bbc23ecd311af9711/neuron-pdp-pbc&quot;,&quot;parentId&quot;:330007}</a></p>
     */
    @NameInMap("gitGroupInfo")
    public String gitGroupInfo;

    /**
     * <strong>example:</strong>
     * <p>2022-05-01T00:00:00.000Z</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>product</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("snowbergDisplay")
    public Boolean snowbergDisplay;

    /**
     * <strong>example:</strong>
     * <p>INNER</p>
     */
    @NameInMap("type")
    public String type;

    public static PdpPbc build(java.util.Map<String, ?> map) throws Exception {
        PdpPbc self = new PdpPbc();
        return TeaModel.build(map, self);
    }

    public PdpPbc setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public PdpPbc setCompany(String company) {
        this.company = company;
        return this;
    }
    public String getCompany() {
        return this.company;
    }

    public PdpPbc setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public PdpPbc setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PdpPbc setDeveloperId(String developerId) {
        this.developerId = developerId;
        return this;
    }
    public String getDeveloperId() {
        return this.developerId;
    }

    public PdpPbc setGitGroup(String gitGroup) {
        this.gitGroup = gitGroup;
        return this;
    }
    public String getGitGroup() {
        return this.gitGroup;
    }

    public PdpPbc setGitGroupInfo(String gitGroupInfo) {
        this.gitGroupInfo = gitGroupInfo;
        return this;
    }
    public String getGitGroupInfo() {
        return this.gitGroupInfo;
    }

    public PdpPbc setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public PdpPbc setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PdpPbc setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PdpPbc setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PdpPbc setSnowbergDisplay(Boolean snowbergDisplay) {
        this.snowbergDisplay = snowbergDisplay;
        return this;
    }
    public Boolean getSnowbergDisplay() {
        return this.snowbergDisplay;
    }

    public PdpPbc setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
