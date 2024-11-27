// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicStatusResponseBody extends TeaModel {
    /**
     * <p>The data structure of the queried topic.</p>
     */
    @NameInMap("Data")
    public OnsTopicStatusResponseBodyData data;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>427EE49D-D762-41FB-8F3D-9BAC96C3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsTopicStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsTopicStatusResponseBody self = new OnsTopicStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsTopicStatusResponseBody setData(OnsTopicStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsTopicStatusResponseBodyData getData() {
        return this.data;
    }

    public OnsTopicStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class OnsTopicStatusResponseBodyData extends TeaModel {
        /**
         * <p>The point in time when the latest message is ready in the topic. If no message exists in the topic, the return value of this parameter is 0.</p>
         * <p>The value of this parameter is a UNIX timestamp in milliseconds.</p>
         * <p>For information about the definition of ready messages and ready time, see <a href="https://help.aliyun.com/document_detail/29533.html">Terms</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1570864984364</p>
         */
        @NameInMap("LastTimeStamp")
        public Long lastTimeStamp;

        /**
         * <p>Indicates the operations that you can perform on the topic. Valid values:</p>
         * <ul>
         * <li><strong>2</strong>: You can publish messages to the topic.</li>
         * <li><strong>4</strong>: You can subscribe to the topic.</li>
         * <li><strong>6</strong>: You can publish messages to and subscribe to the topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Perm")
        public Integer perm;

        /**
         * <p>The total number of messages in all partitions of the topic.</p>
         * 
         * <strong>example:</strong>
         * <p>2310</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static OnsTopicStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsTopicStatusResponseBodyData self = new OnsTopicStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsTopicStatusResponseBodyData setLastTimeStamp(Long lastTimeStamp) {
            this.lastTimeStamp = lastTimeStamp;
            return this;
        }
        public Long getLastTimeStamp() {
            return this.lastTimeStamp;
        }

        public OnsTopicStatusResponseBodyData setPerm(Integer perm) {
            this.perm = perm;
            return this;
        }
        public Integer getPerm() {
            return this.perm;
        }

        public OnsTopicStatusResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
