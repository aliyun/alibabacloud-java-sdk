// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ConfirmAKSProductsEnabledResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<ConfirmAKSProductsEnabledResponseBodyData> data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static ConfirmAKSProductsEnabledResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfirmAKSProductsEnabledResponseBody self = new ConfirmAKSProductsEnabledResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfirmAKSProductsEnabledResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfirmAKSProductsEnabledResponseBody setData(java.util.List<ConfirmAKSProductsEnabledResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ConfirmAKSProductsEnabledResponseBodyData> getData() {
        return this.data;
    }

    public ConfirmAKSProductsEnabledResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ConfirmAKSProductsEnabledResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class ConfirmAKSProductsEnabledResponseBodyData extends TeaModel {
        @NameInMap("Product")
        public String product;

        @NameInMap("Enabled")
        public Boolean enabled;

        public static ConfirmAKSProductsEnabledResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ConfirmAKSProductsEnabledResponseBodyData self = new ConfirmAKSProductsEnabledResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ConfirmAKSProductsEnabledResponseBodyData setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public ConfirmAKSProductsEnabledResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

}
