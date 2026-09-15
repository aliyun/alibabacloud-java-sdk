// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventQuaraFilesRequest extends TeaModel {
    /**
     * <p>The page number of the file list to view.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The identifier of the request source. Set the value to <strong>sas</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The ID of the asset group.</p>
     * 
     * <strong>example:</strong>
     * <p>10541428</p>
     */
    @NameInMap("GroupId")
    @Deprecated
    public String groupId;

    /**
     * <p>The ID of the server group where the quarantined file is located.</p>
     * 
     * <strong>example:</strong>
     * <p>11472451</p>
     */
    @NameInMap("GroupingId")
    public Long groupingId;

    /**
     * <p>The maximum number of entries per page in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The unique identifier of the quarantined file.</p>
     * 
     * <strong>example:</strong>
     * <p>a31337789f64d39b2219733ec99f9af7</p>
     */
    @NameInMap("QuaraTag")
    public String quaraTag;

    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>59.82.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The status of the quarantined files to query. Valid values:  </p>
     * <ul>
     * <li><strong>quaraFailed</strong>: Quarantine failed.</li>
     * <li><strong>quaraDone</strong>: Quarantine succeeded.</li>
     * <li><strong>quaraing</strong>: Quarantine in progress.</li>
     * <li><strong>rollbackFailed</strong>: Quarantine rollback failed.</li>
     * <li><strong>rollbackDone</strong>: Quarantine rollback succeeded.</li>
     * <li><strong>rollbacking</strong>: Quarantine rollback in progress.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>quaraDone</p>
     */
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

    @Deprecated
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
