// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListRenderingInstanceGatewayRequest extends TeaModel {
    /**
     * <p>The time range for filtering. The time must be in ISO 8601 format and in UTC, such as \<code>yyyy-MM-ddTHH:mm:ssZ\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-05-20T12:23:02Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the gateway instance.</p>
     * 
     * <strong>example:</strong>
     * <p>render-xxx</p>
     */
    @NameInMap("GatewayInstanceId")
    public String gatewayInstanceId;

    /**
     * <p>The page number of the list to query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the cloud application service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    /**
     * <p>This parameter specifies the time range filter. The time must be in ISO 8601 format and UTC time, such as yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-05-18T02:20:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ListRenderingInstanceGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRenderingInstanceGatewayRequest self = new ListRenderingInstanceGatewayRequest();
        return TeaModel.build(map, self);
    }

    public ListRenderingInstanceGatewayRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListRenderingInstanceGatewayRequest setGatewayInstanceId(String gatewayInstanceId) {
        this.gatewayInstanceId = gatewayInstanceId;
        return this;
    }
    public String getGatewayInstanceId() {
        return this.gatewayInstanceId;
    }

    public ListRenderingInstanceGatewayRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListRenderingInstanceGatewayRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListRenderingInstanceGatewayRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public ListRenderingInstanceGatewayRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
