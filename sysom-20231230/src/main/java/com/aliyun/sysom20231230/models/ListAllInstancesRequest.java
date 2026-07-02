// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListAllInstancesRequest extends TeaModel {
    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current")
    public String current;

    /**
     * <p>List of filter information.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("filters")
    public String filters;

    /**
     * <p>Instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("instanceType")
    public String instanceType;

    /**
     * <p>Management type.</p>
     * 
     * <strong>example:</strong>
     * <p>managed</p>
     */
    @NameInMap("managedType")
    public String managedType;

    /**
     * <p>Maximum number of records to retrieve at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>Pagination token.</p>
     * <blockquote>
     * <p>If this parameter is not empty, more data is available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>U+w1wv2R4ZWR5oZLXD0+Dp4dD+2BRJj42DLT6GrZysw=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Number of entries returned per page. Default value: pageSize=10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public String pageSize;

    /**
     * <p>Plugin ID.</p>
     * 
     * <strong>example:</strong>
     * <p>01fc4a0b-f199-4885-9861-b4054a310fe7</p>
     */
    @NameInMap("pluginId")
    public String pluginId;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("region")
    public String region;

    public static ListAllInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAllInstancesRequest self = new ListAllInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListAllInstancesRequest setCurrent(String current) {
        this.current = current;
        return this;
    }
    public String getCurrent() {
        return this.current;
    }

    public ListAllInstancesRequest setFilters(String filters) {
        this.filters = filters;
        return this;
    }
    public String getFilters() {
        return this.filters;
    }

    public ListAllInstancesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ListAllInstancesRequest setManagedType(String managedType) {
        this.managedType = managedType;
        return this;
    }
    public String getManagedType() {
        return this.managedType;
    }

    public ListAllInstancesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAllInstancesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAllInstancesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListAllInstancesRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public ListAllInstancesRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
