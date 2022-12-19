// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventQuaraFilesRequest extends TeaModel {
    // The number of the page to return.
    @NameInMap("CurrentPage")
    public String currentPage;

    // The ID of the request source. Set the value to **sas**.
    @NameInMap("From")
    public String from;

    // The ID of the asset group.
    @NameInMap("GroupId")
    @Deprecated
    public String groupId;

    // The ID of the server group to which the server belongs. The quarantined file is located on the server.
    @NameInMap("GroupingId")
    public Long groupingId;

    // The number of entries to return on each page.
    @NameInMap("PageSize")
    public String pageSize;

    // The unique ID of the quarantined file.
    @NameInMap("QuaraTag")
    public String quaraTag;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The status of the quarantined file that you want to query. Valid values:
    // 
    // *   **quaraFailed**: The file fails to be quarantined.
    // *   **quaraDone**: The file is quarantined.
    // *   **quaraing**: The file is being quarantined.
    // *   **rollbackFailed**: The system fails to cancel quarantining the file.
    // *   **rollbackDone**: The system cancelled quarantining the file.
    // *   **rollbacking**: The system is cancelling quarantining the file.
    @NameInMap("Status")
    public String status;

    public static DescribeSuspEventQuaraFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventQuaraFilesRequest self = new DescribeSuspEventQuaraFilesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventQuaraFilesRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSuspEventQuaraFilesRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeSuspEventQuaraFilesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeSuspEventQuaraFilesRequest setGroupingId(Long groupingId) {
        this.groupingId = groupingId;
        return this;
    }
    public Long getGroupingId() {
        return this.groupingId;
    }

    public DescribeSuspEventQuaraFilesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeSuspEventQuaraFilesRequest setQuaraTag(String quaraTag) {
        this.quaraTag = quaraTag;
        return this;
    }
    public String getQuaraTag() {
        return this.quaraTag;
    }

    public DescribeSuspEventQuaraFilesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeSuspEventQuaraFilesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
