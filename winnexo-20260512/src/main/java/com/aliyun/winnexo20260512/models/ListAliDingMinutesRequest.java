// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListAliDingMinutesRequest extends TeaModel {
    /**
     * <p>The cursor for the paged query. Set this parameter to 0 for the first request. For subsequent requests, set this parameter to the <strong>nextCursor</strong> value returned in the previous response. For more information about paging, see the response parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>opaque-next-cursor</p>
     */
    @NameInMap("cursor")
    public String cursor;

    /**
     * <p>The actual end timestamp of the live session, in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-08T23:59:59+08:00</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The query start time. This value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-01T00:00:00+08:00</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>The tenant ID. This is a common parameter. Pass it explicitly through the winnexo-cli --tenant-id option.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListAliDingMinutesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAliDingMinutesRequest self = new ListAliDingMinutesRequest();
        return TeaModel.build(map, self);
    }

    public ListAliDingMinutesRequest setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

    public ListAliDingMinutesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListAliDingMinutesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAliDingMinutesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListAliDingMinutesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
