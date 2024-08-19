// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeStandbyCreateModeResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeStandbyCreateModeResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>EE205C00-30E4-<strong><strong>-</strong></strong>-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeStandbyCreateModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStandbyCreateModeResponseBody self = new DescribeStandbyCreateModeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStandbyCreateModeResponseBody setData(DescribeStandbyCreateModeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeStandbyCreateModeResponseBodyData getData() {
        return this.data;
    }

    public DescribeStandbyCreateModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeStandbyCreateModeResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>BACKUP_RESTORE</p>
         */
        @NameInMap("CreateMode")
        public String createMode;

        public static DescribeStandbyCreateModeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeStandbyCreateModeResponseBodyData self = new DescribeStandbyCreateModeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeStandbyCreateModeResponseBodyData setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

    }

}
