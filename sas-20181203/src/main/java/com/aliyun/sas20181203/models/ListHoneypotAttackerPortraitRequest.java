// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotAttackerPortraitRequest extends TeaModel {
    /**
     * <p>The page number. Default value: <strong>1</strong>. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1672285044000</p>
     */
    @NameInMap("EndTimeStamp")
    public Long endTimeStamp;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <blockquote>
     * <p> We recommend that you do not leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The source IP address of the attack.</p>
     * 
     * <strong>example:</strong>
     * <p>101.133.155.***</p>
     */
    @NameInMap("SrcIp")
    public String srcIp;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1672249044000</p>
     */
    @NameInMap("StartTimeStamp")
    public Long startTimeStamp;

    public static ListHoneypotAttackerPortraitRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHoneypotAttackerPortraitRequest self = new ListHoneypotAttackerPortraitRequest();
        return TeaModel.build(map, self);
    }

    public ListHoneypotAttackerPortraitRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListHoneypotAttackerPortraitRequest setEndTimeStamp(Long endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
        return this;
    }
    public Long getEndTimeStamp() {
        return this.endTimeStamp;
    }

    public ListHoneypotAttackerPortraitRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListHoneypotAttackerPortraitRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHoneypotAttackerPortraitRequest setSrcIp(String srcIp) {
        this.srcIp = srcIp;
        return this;
    }
    public String getSrcIp() {
        return this.srcIp;
    }

    public ListHoneypotAttackerPortraitRequest setStartTimeStamp(Long startTimeStamp) {
        this.startTimeStamp = startTimeStamp;
        return this;
    }
    public Long getStartTimeStamp() {
        return this.startTimeStamp;
    }

}
