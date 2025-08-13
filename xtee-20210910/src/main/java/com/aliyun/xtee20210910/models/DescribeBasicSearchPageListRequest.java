// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeBasicSearchPageListRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values:</p>
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
     * <p>Current page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Long currentPage;

    /**
     * <p>Query start time, accurate to milliseconds (ms).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1753372800000</p>
     */
    @NameInMap("eventBeginTime")
    public Long eventBeginTime;

    /**
     * <p>Event code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;de_ahqhsw7665&quot;]</p>
     */
    @NameInMap("eventCodes")
    public String eventCodes;

    /**
     * <p>End time, accurate to milliseconds (ms).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1753459199059</p>
     */
    @NameInMap("eventEndTime")
    public Long eventEndTime;

    /**
     * <p>Field name</p>
     * 
     * <strong>example:</strong>
     * <p>age</p>
     */
    @NameInMap("fieldName")
    public String fieldName;

    /**
     * <p>Field value</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("fieldValue")
    public String fieldValue;

    /**
     * <p>Page size, with a default value of 10</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>Region code</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    public static DescribeBasicSearchPageListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBasicSearchPageListRequest self = new DescribeBasicSearchPageListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBasicSearchPageListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeBasicSearchPageListRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribeBasicSearchPageListRequest setEventBeginTime(Long eventBeginTime) {
        this.eventBeginTime = eventBeginTime;
        return this;
    }
    public Long getEventBeginTime() {
        return this.eventBeginTime;
    }

    public DescribeBasicSearchPageListRequest setEventCodes(String eventCodes) {
        this.eventCodes = eventCodes;
        return this;
    }
    public String getEventCodes() {
        return this.eventCodes;
    }

    public DescribeBasicSearchPageListRequest setEventEndTime(Long eventEndTime) {
        this.eventEndTime = eventEndTime;
        return this;
    }
    public Long getEventEndTime() {
        return this.eventEndTime;
    }

    public DescribeBasicSearchPageListRequest setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public DescribeBasicSearchPageListRequest setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }
    public String getFieldValue() {
        return this.fieldValue;
    }

    public DescribeBasicSearchPageListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeBasicSearchPageListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
