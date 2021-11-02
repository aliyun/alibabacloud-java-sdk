// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDialogMessagesResponseBody extends TeaModel {
    @NameInMap("DialogList")
    public java.util.List<DescribeDialogMessagesResponseBodyDialogList> dialogList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDialogMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDialogMessagesResponseBody self = new DescribeDialogMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDialogMessagesResponseBody setDialogList(java.util.List<DescribeDialogMessagesResponseBodyDialogList> dialogList) {
        this.dialogList = dialogList;
        return this;
    }
    public java.util.List<DescribeDialogMessagesResponseBodyDialogList> getDialogList() {
        return this.dialogList;
    }

    public DescribeDialogMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDialogMessagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDialogMessagesResponseBodyDialogList extends TeaModel {
        @NameInMap("DialogKey")
        public String dialogKey;

        @NameInMap("ID")
        public Long ID;

        @NameInMap("Params")
        public String params;

        public static DescribeDialogMessagesResponseBodyDialogList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDialogMessagesResponseBodyDialogList self = new DescribeDialogMessagesResponseBodyDialogList();
            return TeaModel.build(map, self);
        }

        public DescribeDialogMessagesResponseBodyDialogList setDialogKey(String dialogKey) {
            this.dialogKey = dialogKey;
            return this;
        }
        public String getDialogKey() {
            return this.dialogKey;
        }

        public DescribeDialogMessagesResponseBodyDialogList setID(Long ID) {
            this.ID = ID;
            return this;
        }
        public Long getID() {
            return this.ID;
        }

        public DescribeDialogMessagesResponseBodyDialogList setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

    }

}
