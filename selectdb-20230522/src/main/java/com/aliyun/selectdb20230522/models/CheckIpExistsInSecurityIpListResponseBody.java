// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class CheckIpExistsInSecurityIpListResponseBody extends TeaModel {
    @NameInMap("Data")
    public CheckIpExistsInSecurityIpListResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4773E4EC-025D-509F-AEA9-D53123FDFB0F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckIpExistsInSecurityIpListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckIpExistsInSecurityIpListResponseBody self = new CheckIpExistsInSecurityIpListResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckIpExistsInSecurityIpListResponseBody setData(CheckIpExistsInSecurityIpListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckIpExistsInSecurityIpListResponseBodyData getData() {
        return this.data;
    }

    public CheckIpExistsInSecurityIpListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CheckIpExistsInSecurityIpListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IpExists")
        public Boolean ipExists;

        public static CheckIpExistsInSecurityIpListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckIpExistsInSecurityIpListResponseBodyData self = new CheckIpExistsInSecurityIpListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckIpExistsInSecurityIpListResponseBodyData setIpExists(Boolean ipExists) {
            this.ipExists = ipExists;
            return this;
        }
        public Boolean getIpExists() {
            return this.ipExists;
        }

    }

}
