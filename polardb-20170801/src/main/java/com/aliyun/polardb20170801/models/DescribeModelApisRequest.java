// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeModelApisRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-xxxxxxxxxx</p>
     */
    @NameInMap("GwClusterId")
    public String gwClusterId;

    /**
     * <strong>example:</strong>
     * <p>mi-xxx,mi-xxxx</p>
     */
    @NameInMap("ModelApiIds")
    public String modelApiIds;

    /**
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("ModelCategory")
    public String modelCategory;

    /**
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>/test</p>
     */
    @NameInMap("PathPrefix")
    public String pathPrefix;

    /**
     * <strong>example:</strong>
     * <p>openai</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeModelApisRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelApisRequest self = new DescribeModelApisRequest();
        return TeaModel.build(map, self);
    }

    public DescribeModelApisRequest setGwClusterId(String gwClusterId) {
        this.gwClusterId = gwClusterId;
        return this;
    }
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    public DescribeModelApisRequest setModelApiIds(String modelApiIds) {
        this.modelApiIds = modelApiIds;
        return this;
    }
    public String getModelApiIds() {
        return this.modelApiIds;
    }

    public DescribeModelApisRequest setModelCategory(String modelCategory) {
        this.modelCategory = modelCategory;
        return this;
    }
    public String getModelCategory() {
        return this.modelCategory;
    }

    public DescribeModelApisRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeModelApisRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeModelApisRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeModelApisRequest setPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
        return this;
    }
    public String getPathPrefix() {
        return this.pathPrefix;
    }

    public DescribeModelApisRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public DescribeModelApisRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeModelApisRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
