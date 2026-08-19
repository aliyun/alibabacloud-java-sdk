// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAppPlayKeyResponseBody extends TeaModel {
    /**
     * <p>The application playback key information.</p>
     */
    @NameInMap("AppPlayKey")
    public GetAppPlayKeyResponseBodyAppPlayKey appPlayKey;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A*****F6-D7393642CA58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAppPlayKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppPlayKeyResponseBody self = new GetAppPlayKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppPlayKeyResponseBody setAppPlayKey(GetAppPlayKeyResponseBodyAppPlayKey appPlayKey) {
        this.appPlayKey = appPlayKey;
        return this;
    }
    public GetAppPlayKeyResponseBodyAppPlayKey getAppPlayKey() {
        return this.appPlayKey;
    }

    public GetAppPlayKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAppPlayKeyResponseBodyAppPlayKey extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app-1000000</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The time when the playback key was created. The time is in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-18T03:59:01Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The time when the playback key was last modified. The time is in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-18T03:59:01Z</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The playback key.</p>
         * <ul>
         * <li>Only uppercase letters, lowercase letters, and digits are supported. The length must be 8 to 20 characters.</li>
         * <li>UTF-8 encoding.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>yzNgTUtAl6HAuosIA</p>
         */
        @NameInMap("PlayKey")
        public String playKey;

        public static GetAppPlayKeyResponseBodyAppPlayKey build(java.util.Map<String, ?> map) throws Exception {
            GetAppPlayKeyResponseBodyAppPlayKey self = new GetAppPlayKeyResponseBodyAppPlayKey();
            return TeaModel.build(map, self);
        }

        public GetAppPlayKeyResponseBodyAppPlayKey setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetAppPlayKeyResponseBodyAppPlayKey setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetAppPlayKeyResponseBodyAppPlayKey setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public GetAppPlayKeyResponseBodyAppPlayKey setPlayKey(String playKey) {
            this.playKey = playKey;
            return this;
        }
        public String getPlayKey() {
            return this.playKey;
        }

    }

}
