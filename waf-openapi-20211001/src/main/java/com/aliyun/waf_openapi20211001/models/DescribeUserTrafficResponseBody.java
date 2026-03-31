// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeUserTrafficResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>EC10C9EA-A367-52D5-<em><strong>-</strong></em></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserTraffic")
    public java.util.List<DescribeUserTrafficResponseBodyUserTraffic> userTraffic;

    public static DescribeUserTrafficResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserTrafficResponseBody self = new DescribeUserTrafficResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserTrafficResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserTrafficResponseBody setUserTraffic(java.util.List<DescribeUserTrafficResponseBodyUserTraffic> userTraffic) {
        this.userTraffic = userTraffic;
        return this;
    }
    public java.util.List<DescribeUserTrafficResponseBodyUserTraffic> getUserTraffic() {
        return this.userTraffic;
    }

    public static class DescribeUserTrafficResponseBodyUserTraffic extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Index")
        public Long index;

        /**
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Pv")
        public Long pv;

        public static DescribeUserTrafficResponseBodyUserTraffic build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserTrafficResponseBodyUserTraffic self = new DescribeUserTrafficResponseBodyUserTraffic();
            return TeaModel.build(map, self);
        }

        public DescribeUserTrafficResponseBodyUserTraffic setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public DescribeUserTrafficResponseBodyUserTraffic setPv(Long pv) {
            this.pv = pv;
            return this;
        }
        public Long getPv() {
            return this.pv;
        }

    }

}
