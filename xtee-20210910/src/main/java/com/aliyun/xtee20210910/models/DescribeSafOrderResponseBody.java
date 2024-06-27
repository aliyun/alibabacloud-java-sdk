// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSafOrderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("resultObject")
    public DescribeSafOrderResponseBodyResultObject resultObject;

    public static DescribeSafOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSafOrderResponseBody self = new DescribeSafOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSafOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSafOrderResponseBody setResultObject(DescribeSafOrderResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeSafOrderResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeSafOrderResponseBodyResultObject extends TeaModel {
        @NameInMap("expirationDate")
        public Long expirationDate;

        public static DescribeSafOrderResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeSafOrderResponseBodyResultObject self = new DescribeSafOrderResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeSafOrderResponseBodyResultObject setExpirationDate(Long expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public Long getExpirationDate() {
            return this.expirationDate;
        }

    }

}
