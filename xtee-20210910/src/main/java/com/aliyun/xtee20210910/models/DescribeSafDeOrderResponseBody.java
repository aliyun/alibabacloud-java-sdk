// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSafDeOrderResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public DescribeSafDeOrderResponseBodyResultObject resultObject;

    public static DescribeSafDeOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSafDeOrderResponseBody self = new DescribeSafDeOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSafDeOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSafDeOrderResponseBody setResultObject(DescribeSafDeOrderResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeSafDeOrderResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeSafDeOrderResponseBodyResultObject extends TeaModel {
        @NameInMap("expirationDate")
        public Long expirationDate;

        @NameInMap("openUserType")
        public Integer openUserType;

        public static DescribeSafDeOrderResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeSafDeOrderResponseBodyResultObject self = new DescribeSafDeOrderResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeSafDeOrderResponseBodyResultObject setExpirationDate(Long expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public Long getExpirationDate() {
            return this.expirationDate;
        }

        public DescribeSafDeOrderResponseBodyResultObject setOpenUserType(Integer openUserType) {
            this.openUserType = openUserType;
            return this;
        }
        public Integer getOpenUserType() {
            return this.openUserType;
        }

    }

}
