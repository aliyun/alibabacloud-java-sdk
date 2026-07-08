// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecEventDetailResponseBody extends TeaModel {
    /**
     * <p>The total number of attacks in the security event.</p>
     * 
     * <strong>example:</strong>
     * <p>345</p>
     */
    @NameInMap("AttackCnt")
    public String attackCnt;

    /**
     * <p>The list of attackers associated with the security event.</p>
     */
    @NameInMap("AttackerList")
    public java.util.List<String> attackerList;

    /**
     * <p>The details of the security event.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;location\&quot;:[\&quot;FR\&quot;,\&quot;CN\&quot;],\&quot;location_type\&quot;:\&quot;country\&quot;}</p>
     */
    @NameInMap("DetailValue")
    public String detailValue;

    /**
     * <p>The end of the time range during which the security event occurred. This value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1683703260</p>
     */
    @NameInMap("EndTs")
    public String endTs;

    /**
     * <p>The ID of the API security event.</p>
     * 
     * <strong>example:</strong>
     * <p>18ba94fea9***e66ba0557b7b91</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The severity level of the security event. Valid values:</p>
     * <ul>
     * <li><p><strong>high</strong>: high severity.</p>
     * </li>
     * <li><p><strong>medium</strong>: medium severity.</p>
     * </li>
     * <li><p><strong>low</strong>: low severity.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>low</p>
     */
    @NameInMap("EventLevel")
    public String eventLevel;

    /**
     * <p>The dimension of the security event. Valid values:</p>
     * <ul>
     * <li><p><strong>ip</strong> (default): IP security event.</p>
     * </li>
     * <li><p><strong>account</strong>: account security event.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("EventScope")
    public String eventScope;

    /**
     * <p>The type of the security event.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> operation to query the supported event types.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ObtainSensitiveUnauthorized</p>
     */
    @NameInMap("EventTag")
    public String eventTag;

    /**
     * <p>The remarks added to the security event.</p>
     * 
     * <strong>example:</strong>
     * <p>already confirmed.</p>
     */
    @NameInMap("Note")
    public String note;

    /**
     * <p>The source of the event type rule. Valid values:</p>
     * <ul>
     * <li><p><strong>custom</strong>: a user-defined rule.</p>
     * </li>
     * <li><p><strong>default</strong>: a built-in rule.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("Origin")
    public String origin;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range during which the security event occurred. This value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1683648000</p>
     */
    @NameInMap("StartTs")
    public String startTs;

    /**
     * <p>The event status. Valid values:</p>
     * <ul>
     * <li><p><strong>toBeConfirmed</strong>: to be confirmed.</p>
     * </li>
     * <li><p><strong>confirmed</strong>: confirmed.</p>
     * </li>
     * <li><p><strong>actioned</strong>: handled.</p>
     * </li>
     * <li><p><strong>ignored</strong>: ignored.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>toBeConfirmed</p>
     */
    @NameInMap("UserStatus")
    public String userStatus;

    public static DescribeApisecEventDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecEventDetailResponseBody self = new DescribeApisecEventDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisecEventDetailResponseBody setAttackCnt(String attackCnt) {
        this.attackCnt = attackCnt;
        return this;
    }
    public String getAttackCnt() {
        return this.attackCnt;
    }

    public DescribeApisecEventDetailResponseBody setAttackerList(java.util.List<String> attackerList) {
        this.attackerList = attackerList;
        return this;
    }
    public java.util.List<String> getAttackerList() {
        return this.attackerList;
    }

    public DescribeApisecEventDetailResponseBody setDetailValue(String detailValue) {
        this.detailValue = detailValue;
        return this;
    }
    public String getDetailValue() {
        return this.detailValue;
    }

    public DescribeApisecEventDetailResponseBody setEndTs(String endTs) {
        this.endTs = endTs;
        return this;
    }
    public String getEndTs() {
        return this.endTs;
    }

    public DescribeApisecEventDetailResponseBody setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public DescribeApisecEventDetailResponseBody setEventLevel(String eventLevel) {
        this.eventLevel = eventLevel;
        return this;
    }
    public String getEventLevel() {
        return this.eventLevel;
    }

    public DescribeApisecEventDetailResponseBody setEventScope(String eventScope) {
        this.eventScope = eventScope;
        return this;
    }
    public String getEventScope() {
        return this.eventScope;
    }

    public DescribeApisecEventDetailResponseBody setEventTag(String eventTag) {
        this.eventTag = eventTag;
        return this;
    }
    public String getEventTag() {
        return this.eventTag;
    }

    public DescribeApisecEventDetailResponseBody setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public DescribeApisecEventDetailResponseBody setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public DescribeApisecEventDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApisecEventDetailResponseBody setStartTs(String startTs) {
        this.startTs = startTs;
        return this;
    }
    public String getStartTs() {
        return this.startTs;
    }

    public DescribeApisecEventDetailResponseBody setUserStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }
    public String getUserStatus() {
        return this.userStatus;
    }

}
