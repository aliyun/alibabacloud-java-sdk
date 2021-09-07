// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeSqlAuditInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DescribeSqlAuditInfoResponseBodyData data;

    public static DescribeSqlAuditInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlAuditInfoResponseBody self = new DescribeSqlAuditInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSqlAuditInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSqlAuditInfoResponseBody setData(DescribeSqlAuditInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSqlAuditInfoResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeSqlAuditInfoResponseBodyData extends TeaModel {
        @NameInMap("SLSLogStore")
        public String SLSLogStore;

        @NameInMap("SLSProject")
        public String SLSProject;

        @NameInMap("IsEnabled")
        public Boolean isEnabled;

        public static DescribeSqlAuditInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlAuditInfoResponseBodyData self = new DescribeSqlAuditInfoResponseBodyData();
            return TeaModel.build(map, self);
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

        public DescribeSqlAuditInfoResponseBodyData setIsEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Boolean getIsEnabled() {
            return this.isEnabled;
        }

    }

}
