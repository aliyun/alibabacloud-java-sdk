// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeSqlAuditInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeSqlAuditInfoResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>DC3ABA3E-0F8A-4596-9104-F5155C******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSqlAuditInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlAuditInfoResponseBody self = new DescribeSqlAuditInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSqlAuditInfoResponseBody setData(DescribeSqlAuditInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSqlAuditInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeSqlAuditInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSqlAuditInfoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsEnabled")
        public Boolean isEnabled;

        /**
         * <strong>example:</strong>
         * <p>polardbx-sqlaudit-log</p>
         */
        @NameInMap("SLSLogStore")
        public String SLSLogStore;

        /**
         * <strong>example:</strong>
         * <p>polardbx-sqlaudit-cn-hangzhou-123456789</p>
         */
        @NameInMap("SLSProject")
        public String SLSProject;

        public static DescribeSqlAuditInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlAuditInfoResponseBodyData self = new DescribeSqlAuditInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSqlAuditInfoResponseBodyData setIsEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Boolean getIsEnabled() {
            return this.isEnabled;
        }

        public DescribeSqlAuditInfoResponseBodyData setSLSLogStore(String SLSLogStore) {
            this.SLSLogStore = SLSLogStore;
            return this;
        }
        public String getSLSLogStore() {
            return this.SLSLogStore;
        }

        public DescribeSqlAuditInfoResponseBodyData setSLSProject(String SLSProject) {
            this.SLSProject = SLSProject;
            return this;
        }
        public String getSLSProject() {
            return this.SLSProject;
        }

    }

}
