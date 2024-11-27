// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessageTraceResponseBody extends TeaModel {
    /**
     * <p>The information about the message that is queried.</p>
     */
    @NameInMap("Data")
    public OnsMessageTraceResponseBodyData data;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>EAE5BE23-37A1-4354-94D6-E44AE17E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsMessageTraceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsMessageTraceResponseBody self = new OnsMessageTraceResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsMessageTraceResponseBody setData(OnsMessageTraceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsMessageTraceResponseBodyData getData() {
        return this.data;
    }

    public OnsMessageTraceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class OnsMessageTraceResponseBodyDataMessageTrack extends TeaModel {
        /**
         * <p>The ID of the consumer group that subscribes to the topic.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_test_group_id</p>
         */
        @NameInMap("ConsumerGroup")
        public String consumerGroup;

        /**
         * <p>The ID of the instance to which the message you want to query belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>MQ_INST_111111111111_DOxxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The status of the message. Valid values:</p>
         * <ul>
         * <li><strong>CONSUMED</strong>: The message is consumed.</li>
         * <li><strong>CONSUMED_BUT_FILTERED</strong>: No consumer group subscribes to the message. The message is filtered out and not consumed.</li>
         * <li><strong>NOT_CONSUME_YET</strong>: The message is not consumed.</li>
         * <li><strong>NOT_ONLINE</strong>: The consumer group is offline.</li>
         * <li><strong>UNKNOWN</strong>: The message is not consumed due to unknown reasons.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CONSUMED</p>
         */
        @NameInMap("TrackType")
        public String trackType;

        public static OnsMessageTraceResponseBodyDataMessageTrack build(java.util.Map<String, ?> map) throws Exception {
            OnsMessageTraceResponseBodyDataMessageTrack self = new OnsMessageTraceResponseBodyDataMessageTrack();
            return TeaModel.build(map, self);
        }

        public OnsMessageTraceResponseBodyDataMessageTrack setConsumerGroup(String consumerGroup) {
            this.consumerGroup = consumerGroup;
            return this;
        }
        public String getConsumerGroup() {
            return this.consumerGroup;
        }

        public OnsMessageTraceResponseBodyDataMessageTrack setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public OnsMessageTraceResponseBodyDataMessageTrack setTrackType(String trackType) {
            this.trackType = trackType;
            return this;
        }
        public String getTrackType() {
            return this.trackType;
        }

    }

    public static class OnsMessageTraceResponseBodyData extends TeaModel {
        @NameInMap("MessageTrack")
        public java.util.List<OnsMessageTraceResponseBodyDataMessageTrack> messageTrack;

        public static OnsMessageTraceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsMessageTraceResponseBodyData self = new OnsMessageTraceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsMessageTraceResponseBodyData setMessageTrack(java.util.List<OnsMessageTraceResponseBodyDataMessageTrack> messageTrack) {
            this.messageTrack = messageTrack;
            return this;
        }
        public java.util.List<OnsMessageTraceResponseBodyDataMessageTrack> getMessageTrack() {
            return this.messageTrack;
        }

    }

}
