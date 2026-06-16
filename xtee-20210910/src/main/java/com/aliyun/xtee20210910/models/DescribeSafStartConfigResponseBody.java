// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSafStartConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned object.</p>
     */
    @NameInMap("resultObject")
    public DescribeSafStartConfigResponseBodyResultObject resultObject;

    public static DescribeSafStartConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSafStartConfigResponseBody self = new DescribeSafStartConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSafStartConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSafStartConfigResponseBody setResultObject(DescribeSafStartConfigResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeSafStartConfigResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeSafStartConfigResponseBodyResultObject extends TeaModel {
        /**
         * <p>The device type list.</p>
         */
        @NameInMap("deviceTypes")
        public java.util.List<String> deviceTypes;

        /**
         * <p>The event codes.</p>
         */
        @NameInMap("eventCodes")
        public java.util.List<String> eventCodes;

        /**
         * <p>The configuration language details.</p>
         */
        @NameInMap("languages")
        public java.util.List<String> languages;

        /**
         * <p>The server regions.</p>
         */
        @NameInMap("serverRegions")
        public java.util.List<String> serverRegions;

        public static DescribeSafStartConfigResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeSafStartConfigResponseBodyResultObject self = new DescribeSafStartConfigResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeSafStartConfigResponseBodyResultObject setDeviceTypes(java.util.List<String> deviceTypes) {
            this.deviceTypes = deviceTypes;
            return this;
        }
        public java.util.List<String> getDeviceTypes() {
            return this.deviceTypes;
        }

        public DescribeSafStartConfigResponseBodyResultObject setEventCodes(java.util.List<String> eventCodes) {
            this.eventCodes = eventCodes;
            return this;
        }
        public java.util.List<String> getEventCodes() {
            return this.eventCodes;
        }

        public DescribeSafStartConfigResponseBodyResultObject setLanguages(java.util.List<String> languages) {
            this.languages = languages;
            return this;
        }
        public java.util.List<String> getLanguages() {
            return this.languages;
        }

        public DescribeSafStartConfigResponseBodyResultObject setServerRegions(java.util.List<String> serverRegions) {
            this.serverRegions = serverRegions;
            return this;
        }
        public java.util.List<String> getServerRegions() {
            return this.serverRegions;
        }

    }

}
