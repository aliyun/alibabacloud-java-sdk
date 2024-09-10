// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAccountLabelResponseBody extends TeaModel {
    @NameInMap("AccountLabelList")
    public java.util.List<GetAccountLabelResponseBodyAccountLabelList> accountLabelList;

    /**
     * <strong>example:</strong>
     * <p>7BC55C8F-226E-5AF5-9A2C-2EC43864****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAccountLabelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountLabelResponseBody self = new GetAccountLabelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountLabelResponseBody setAccountLabelList(java.util.List<GetAccountLabelResponseBodyAccountLabelList> accountLabelList) {
        this.accountLabelList = accountLabelList;
        return this;
    }
    public java.util.List<GetAccountLabelResponseBodyAccountLabelList> getAccountLabelList() {
        return this.accountLabelList;
    }

    public GetAccountLabelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAccountLabelResponseBodyAccountLabelList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SasStep</p>
         */
        @NameInMap("LabelSeries")
        public String labelSeries;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LabelStatus")
        public Boolean labelStatus;

        public static GetAccountLabelResponseBodyAccountLabelList build(java.util.Map<String, ?> map) throws Exception {
            GetAccountLabelResponseBodyAccountLabelList self = new GetAccountLabelResponseBodyAccountLabelList();
            return TeaModel.build(map, self);
        }

        public GetAccountLabelResponseBodyAccountLabelList setLabelSeries(String labelSeries) {
            this.labelSeries = labelSeries;
            return this;
        }
        public String getLabelSeries() {
            return this.labelSeries;
        }

        public GetAccountLabelResponseBodyAccountLabelList setLabelStatus(Boolean labelStatus) {
            this.labelStatus = labelStatus;
            return this;
        }
        public Boolean getLabelStatus() {
            return this.labelStatus;
        }

    }

}
