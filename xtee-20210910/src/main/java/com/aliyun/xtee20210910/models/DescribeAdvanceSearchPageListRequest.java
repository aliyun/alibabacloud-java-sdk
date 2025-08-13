// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAdvanceSearchPageListRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
     * <p>Condition value.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;relationship&quot;: &quot;and&quot;,
     *     &quot;list&quot;: [
     *         {
     *             &quot;deepCount&quot;: 1,
     *             &quot;left&quot;: {
     *                 &quot;hasRightVariable&quot;: true,
     *                 &quot;fieldType&quot;: &quot;STRING&quot;,
     *                 &quot;functionName&quot;: &quot;&quot;,
     *                 &quot;leftVariableType&quot;: &quot;NATIVE&quot;,
     *                 &quot;name&quot;: &quot;accountId&quot;,
     *                 &quot;operatorCode&quot;: &quot;equals&quot;
     *             },
     *             &quot;right&quot;: {
     *                 &quot;rightVariableType&quot;: &quot;constant&quot;,
     *                 &quot;name&quot;: &quot;10000&quot;,
     *                 &quot;functionName&quot;: &quot;&quot;
     *             },
     *             &quot;operatorCode&quot;: &quot;equals&quot;
     *         }
     *     ]
     * }</p>
     */
    @NameInMap("condition")
    public String condition;

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
     * <p>Page size, default value is 10</p>
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

    public static DescribeAdvanceSearchPageListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvanceSearchPageListRequest self = new DescribeAdvanceSearchPageListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAdvanceSearchPageListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAdvanceSearchPageListRequest setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public DescribeAdvanceSearchPageListRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAdvanceSearchPageListRequest setEventBeginTime(Long eventBeginTime) {
        this.eventBeginTime = eventBeginTime;
        return this;
    }
    public Long getEventBeginTime() {
        return this.eventBeginTime;
    }

    public DescribeAdvanceSearchPageListRequest setEventCodes(String eventCodes) {
        this.eventCodes = eventCodes;
        return this;
    }
    public String getEventCodes() {
        return this.eventCodes;
    }

    public DescribeAdvanceSearchPageListRequest setEventEndTime(Long eventEndTime) {
        this.eventEndTime = eventEndTime;
        return this;
    }
    public Long getEventEndTime() {
        return this.eventEndTime;
    }

    public DescribeAdvanceSearchPageListRequest setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public DescribeAdvanceSearchPageListRequest setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }
    public String getFieldValue() {
        return this.fieldValue;
    }

    public DescribeAdvanceSearchPageListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeAdvanceSearchPageListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
