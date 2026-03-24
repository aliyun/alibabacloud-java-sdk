// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeFreeUserEventsResponseBody extends TeaModel {
    /**
     * <p>The list of security events detected by the basic scan.</p>
     */
    @NameInMap("Event")
    public java.util.List<DescribeFreeUserEventsResponseBodyEvent> event;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8A2DF88D-90C2-56E9-B8D5-36BB9646791C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFreeUserEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFreeUserEventsResponseBody self = new DescribeFreeUserEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFreeUserEventsResponseBody setEvent(java.util.List<DescribeFreeUserEventsResponseBodyEvent> event) {
        this.event = event;
        return this;
    }
    public java.util.List<DescribeFreeUserEventsResponseBodyEvent> getEvent() {
        return this.event;
    }

    public DescribeFreeUserEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFreeUserEventsResponseBodyEvent extends TeaModel {
        /**
         * <p>The API path.</p>
         * 
         * <strong>example:</strong>
         * <p>/api/login</p>
         */
        @NameInMap("ApiFormat")
        public String apiFormat;

        /**
         * <p>The attack IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>104.234.140.**</p>
         */
        @NameInMap("AttackIP")
        public String attackIP;

        /**
         * <p>The time of the attack. This value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1683703260</p>
         */
        @NameInMap("AttackTime")
        public Long attackTime;

        /**
         * <p>The domain name to which the API belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>www.***.cn</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The event level. Valid values:</p>
         * <ul>
         * <li><p><strong>high</strong>: high risk.</p>
         * </li>
         * <li><p><strong>medium</strong>: medium risk.</p>
         * </li>
         * <li><p><strong>low</strong>: low risk.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("EventLevel")
        public String eventLevel;

        /**
         * <p>The event type.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> operation to obtain the supported event types.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Event_DataTraverse</p>
         */
        @NameInMap("EventTag")
        public String eventTag;

        public static DescribeFreeUserEventsResponseBodyEvent build(java.util.Map<String, ?> map) throws Exception {
            DescribeFreeUserEventsResponseBodyEvent self = new DescribeFreeUserEventsResponseBodyEvent();
            return TeaModel.build(map, self);
        }

        public DescribeFreeUserEventsResponseBodyEvent setApiFormat(String apiFormat) {
            this.apiFormat = apiFormat;
            return this;
        }
        public String getApiFormat() {
            return this.apiFormat;
        }

        public DescribeFreeUserEventsResponseBodyEvent setAttackIP(String attackIP) {
            this.attackIP = attackIP;
            return this;
        }
        public String getAttackIP() {
            return this.attackIP;
        }

        public DescribeFreeUserEventsResponseBodyEvent setAttackTime(Long attackTime) {
            this.attackTime = attackTime;
            return this;
        }
        public Long getAttackTime() {
            return this.attackTime;
        }

        public DescribeFreeUserEventsResponseBodyEvent setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeFreeUserEventsResponseBodyEvent setEventLevel(String eventLevel) {
            this.eventLevel = eventLevel;
            return this;
        }
        public String getEventLevel() {
            return this.eventLevel;
        }

        public DescribeFreeUserEventsResponseBodyEvent setEventTag(String eventTag) {
            this.eventTag = eventTag;
            return this;
        }
        public String getEventTag() {
            return this.eventTag;
        }

    }

}
