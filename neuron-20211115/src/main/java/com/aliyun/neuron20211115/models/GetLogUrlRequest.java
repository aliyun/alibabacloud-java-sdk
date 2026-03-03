// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetLogUrlRequest extends TeaModel {
    /**
     * <p>ip</p>
     * 
     * <strong>example:</strong>
     * <p>172.35.1.139</p>
     */
    @NameInMap("ip")
    public String ip;

    @NameInMap("orderBy")
    public String orderBy;

    @NameInMap("orderDirection")
    public String orderDirection;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>Exception</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <strong>example:</strong>
     * <p>1667985359</p>
     */
    @NameInMap("to")
    public Integer to;

    public static GetLogUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLogUrlRequest self = new GetLogUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetLogUrlRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public GetLogUrlRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetLogUrlRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public GetLogUrlRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetLogUrlRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetLogUrlRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GetLogUrlRequest setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    public GetLogUrlRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public GetLogUrlRequest setTo(Integer to) {
        this.to = to;
        return this;
    }
    public Integer getTo() {
        return this.to;
    }

}
