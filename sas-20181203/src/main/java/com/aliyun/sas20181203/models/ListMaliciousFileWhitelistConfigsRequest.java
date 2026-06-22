// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListMaliciousFileWhitelistConfigsRequest extends TeaModel {
    /**
     * <p>The page number of the current page to return. Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The alerting name. Valid values:</p>
     * <ul>
     * <li>ALL: all Alarm Metric values.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The event ID.</p>
     * <blockquote>
     * <p>Notice: This field is deprecated..</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("IdList")
    @Deprecated
    public Long idList;

    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries to return per page in a paging query. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The business source. This parameter can be left empty. Default value: agentless.</p>
     * 
     * <strong>example:</strong>
     * <p>agentless</p>
     */
    @NameInMap("Source")
    public String source;

    public static ListMaliciousFileWhitelistConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMaliciousFileWhitelistConfigsRequest self = new ListMaliciousFileWhitelistConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListMaliciousFileWhitelistConfigsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListMaliciousFileWhitelistConfigsRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    @Deprecated
    public ListMaliciousFileWhitelistConfigsRequest setIdList(Long idList) {
        this.idList = idList;
        return this;
    }
    public Long getIdList() {
        return this.idList;
    }

    public ListMaliciousFileWhitelistConfigsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListMaliciousFileWhitelistConfigsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMaliciousFileWhitelistConfigsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
