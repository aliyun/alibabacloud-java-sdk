// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotEventFlowsRequest extends TeaModel {
    /**
     * <p>The page number. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The status of the event. Valid values:</p>
     * <br>
     * <p>*   **y**: handled</p>
     * <p>*   **n**: unhandled</p>
     * <p>*   **a**: all statuses</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <br>
     * <p>>  We recommend that you do not leave this parameter empty.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the alert event. The ID of the management account of the ListHoneypotEvents resource directory.</p>
     * <br>
     * <p>>  You can call the [ListHoneypotEvents](~~ListHoneypotEvents~~) operation to query the IDs of alert events.</p>
     */
    @NameInMap("SecurityEventId")
    public Long securityEventId;

    public static ListHoneypotEventFlowsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHoneypotEventFlowsRequest self = new ListHoneypotEventFlowsRequest();
        return TeaModel.build(map, self);
    }

    public ListHoneypotEventFlowsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListHoneypotEventFlowsRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public ListHoneypotEventFlowsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListHoneypotEventFlowsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHoneypotEventFlowsRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHoneypotEventFlowsRequest setSecurityEventId(Long securityEventId) {
        this.securityEventId = securityEventId;
        return this;
    }
    public Long getSecurityEventId() {
        return this.securityEventId;
    }

}
