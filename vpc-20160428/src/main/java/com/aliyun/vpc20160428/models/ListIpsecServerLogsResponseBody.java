// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListIpsecServerLogsResponseBody extends TeaModel {
    /**
     * <p>The number of entries on the current page.</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>An array of strings.</p>
     * <br>
     * <p>Each item in the array is a log entry.</p>
     */
    @NameInMap("Data")
    public java.util.List<String> data;

    /**
     * <p>Indicates whether the log is accurate. Valid values:</p>
     * <br>
     * <p>*   **true**: accurate</p>
     * <p>*   **false**: inaccurate</p>
     */
    @NameInMap("IsCompleted")
    public Boolean isCompleted;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListIpsecServerLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpsecServerLogsResponseBody self = new ListIpsecServerLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIpsecServerLogsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListIpsecServerLogsResponseBody setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

    public ListIpsecServerLogsResponseBody setIsCompleted(Boolean isCompleted) {
        this.isCompleted = isCompleted;
        return this;
    }
    public Boolean getIsCompleted() {
        return this.isCompleted;
    }

    public ListIpsecServerLogsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListIpsecServerLogsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListIpsecServerLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
