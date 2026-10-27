// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ResetLogShipperRequest extends TeaModel {
    /**
     * <p>The global data retention period in the hot storage tier.</p>
     * <blockquote>
     * <p>Valid values: greater than or equal to 7 days and less than the log retention period.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("HotTtl")
    public Integer hotTtl;

    /**
     * <p>The configuration information for log analysis in Security Center.</p>
     */
    @NameInMap("LogMetaList")
    public java.util.List<ResetLogShipperRequestLogMetaList> logMetaList;

    /**
     * <p>The global log retention period in days.</p>
     * <blockquote>
     * <p>This parameter is supported only in the pay-as-you-go billing mode for logs.</p>
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
         * <p>The Logstore to be configured.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeLogMeta~~">DescribeLogMeta</a> operation to obtain the value of this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sas-security-log</p>
         */
        @NameInMap("ConfigLogStore")
        public String configLogStore;

        /**
         * <p>The data retention period in the hot storage tier of the Logstore.</p>
         * <blockquote>
         * <p>Valid values: greater than or equal to 7 days and less than the log retention period. Specifying the data retention period in the hot storage tier for a single Logstore overrides the global settings.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("HotTtl")
        public Integer hotTtl;

        /**
         * <p>The current enabling status. Valid values:</p>
         * <ul>
         * <li><strong>disabled</strong>: The feature is disabled.</li>
         * <li><strong>enabled</strong>: The feature is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The log retention period of the Logstore in days.</p>
         * <blockquote>
         * <p>Specifying the log retention period for a single Logstore overrides the global settings.</p>
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
