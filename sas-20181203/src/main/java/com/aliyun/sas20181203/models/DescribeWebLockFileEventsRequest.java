// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockFileEventsRequest extends TeaModel {
    // The number of the page to return. Default value: **1**.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // Specifies whether the event on web tamper proofing is handled. Valid values:
    // 
    // *   **n**: no
    // *   **y**: yes
    @NameInMap("Dealed")
    public String dealed;

    // The number of entries to return on each page. Default value: **10**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The name of the process.
    @NameInMap("ProcessName")
    public String processName;

    // The name of the asset.
    // 
    // >  You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the names of assets.
    @NameInMap("Remark")
    public String remark;

    // The beginning of the time range to query. The value is a UNIX timestamp.
    @NameInMap("TsBegin")
    public Long tsBegin;

    // The end of the time range to query. The value is a UNIX timestamp.
    @NameInMap("TsEnd")
    public Long tsEnd;

    public static DescribeWebLockFileEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockFileEventsRequest self = new DescribeWebLockFileEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockFileEventsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWebLockFileEventsRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public DescribeWebLockFileEventsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWebLockFileEventsRequest setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public DescribeWebLockFileEventsRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeWebLockFileEventsRequest setTsBegin(Long tsBegin) {
        this.tsBegin = tsBegin;
        return this;
    }
    public Long getTsBegin() {
        return this.tsBegin;
    }

    public DescribeWebLockFileEventsRequest setTsEnd(Long tsEnd) {
        this.tsEnd = tsEnd;
        return this;
    }
    public Long getTsEnd() {
        return this.tsEnd;
    }

}
