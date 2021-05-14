// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventQuaraFilesRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("Status")
    public String status;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("QuaraTag")
    public String quaraTag;

    @NameInMap("CurrentPage")
    public String currentPage;

    @NameInMap("From")
    public String from;

    public static DescribeSuspEventQuaraFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventQuaraFilesRequest self = new DescribeSuspEventQuaraFilesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventQuaraFilesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeSuspEventQuaraFilesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeSuspEventQuaraFilesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeSuspEventQuaraFilesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeSuspEventQuaraFilesRequest setQuaraTag(String quaraTag) {
        this.quaraTag = quaraTag;
        return this;
    }
    public String getQuaraTag() {
        return this.quaraTag;
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

}
