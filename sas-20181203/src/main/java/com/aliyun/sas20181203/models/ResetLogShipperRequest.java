// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ResetLogShipperRequest extends TeaModel {
    /**
     * <p>The global retention period of hot data.</p>
     * <blockquote>
     * <p> The value of this parameter must be at least 7 and smaller than the log retention period. Unit: days.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("HotTtl")
    public Integer hotTtl;

    /**
     * <p>The settings of the log analysis feature.</p>
     */
    @NameInMap("LogMetaList")
    public java.util.List<ResetLogShipperRequestLogMetaList> logMetaList;

    /**
     * <p>The global log retention period.</p>
     * <blockquote>
     * <p> This parameter is supported only when the log analysis feature uses the pay-as-you-go billing method.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>180</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    public static ResetLogShipperRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetLogShipperRequest self = new ResetLogShipperRequest();
        return TeaModel.build(map, self);
    }

    public ResetLogShipperRequest setHotTtl(Integer hotTtl) {
        this.hotTtl = hotTtl;
        return this;
    }
    public Integer getHotTtl() {
        return this.hotTtl;
    }

    public ResetLogShipperRequest setLogMetaList(java.util.List<ResetLogShipperRequestLogMetaList> logMetaList) {
        this.logMetaList = logMetaList;
        return this;
    }
    public java.util.List<ResetLogShipperRequestLogMetaList> getLogMetaList() {
        return this.logMetaList;
    }

    public ResetLogShipperRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public static class ResetLogShipperRequestLogMetaList extends TeaModel {
        /**
         * <p>The Logstore that you want to configure.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeLogMeta~~">DescribeLogMeta</a> operation to query the Logstore.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sas-security-log</p>
         */
        @NameInMap("ConfigLogStore")
        public String configLogStore;

        /**
         * <p>The retention period of hot data in the Logstore.</p>
         * <blockquote>
         * <p> The value of this parameter must be at least 7 and smaller than the log retention period. Unit: days. If you specify this parameter for the Logstore, the global retention period of hot data specified by the HotTtl parameter is overwritten.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("HotTtl")
        public Integer hotTtl;

        /**
         * <p>The status of the log analysis feature. Valid values:</p>
         * <ul>
         * <li><strong>disabled</strong></li>
         * <li><strong>enabled</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The log retention period of the Logstore.</p>
         * <blockquote>
         * <p> If you specify this parameter for the Logstore, the global log retention period specified by the Ttl parameter is overwritten.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        public static ResetLogShipperRequestLogMetaList build(java.util.Map<String, ?> map) throws Exception {
            ResetLogShipperRequestLogMetaList self = new ResetLogShipperRequestLogMetaList();
            return TeaModel.build(map, self);
        }

        public ResetLogShipperRequestLogMetaList setConfigLogStore(String configLogStore) {
            this.configLogStore = configLogStore;
            return this;
        }
        public String getConfigLogStore() {
            return this.configLogStore;
        }

        public ResetLogShipperRequestLogMetaList setHotTtl(Integer hotTtl) {
            this.hotTtl = hotTtl;
            return this;
        }
        public Integer getHotTtl() {
            return this.hotTtl;
        }

        public ResetLogShipperRequestLogMetaList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ResetLogShipperRequestLogMetaList setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

    }

}
