// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetServiceTrailResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. The system generates a unique identifier for each request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>C699E4E4-F2F4-58FC-A949-457FFE59****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The service trail configuration.</p>
     */
    @NameInMap("ServiceTrail")
    public GetServiceTrailResponseBodyServiceTrail serviceTrail;

    public static GetServiceTrailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceTrailResponseBody self = new GetServiceTrailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceTrailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceTrailResponseBody setServiceTrail(GetServiceTrailResponseBodyServiceTrail serviceTrail) {
        this.serviceTrail = serviceTrail;
        return this;
    }
    public GetServiceTrailResponseBodyServiceTrail getServiceTrail() {
        return this.serviceTrail;
    }

    public static class GetServiceTrailResponseBodyServiceTrail extends TeaModel {
        /**
         * <p>The enabling status of the service trail. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: Enabled.</li>
         * <li><strong>off</strong>: Shutdown.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The timestamp when the service trail was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1687250241000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The timestamp when the service trail was last updated. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1687250241000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetServiceTrailResponseBodyServiceTrail build(java.util.Map<String, ?> map) throws Exception {
            GetServiceTrailResponseBodyServiceTrail self = new GetServiceTrailResponseBodyServiceTrail();
            return TeaModel.build(map, self);
        }

        public GetServiceTrailResponseBodyServiceTrail setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public GetServiceTrailResponseBodyServiceTrail setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetServiceTrailResponseBodyServiceTrail setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
