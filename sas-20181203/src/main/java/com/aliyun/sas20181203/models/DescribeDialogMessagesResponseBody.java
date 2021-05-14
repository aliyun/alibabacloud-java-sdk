// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDialogMessagesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DialogList")
    public java.util.List<DescribeDialogMessagesResponseBodyDialogList> dialogList;

    public static DescribeDialogMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDialogMessagesResponseBody self = new DescribeDialogMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDialogMessagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDialogMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDialogMessagesResponseBody setDialogList(java.util.List<DescribeDialogMessagesResponseBodyDialogList> dialogList) {
        this.dialogList = dialogList;
        return this;
    }
    public java.util.List<DescribeDialogMessagesResponseBodyDialogList> getDialogList() {
        return this.dialogList;
    }

    public static class DescribeDialogMessagesResponseBodyDialogList extends TeaModel {
        @NameInMap("DialogKey")
        public String dialogKey;

        @NameInMap("Params")
        public String params;

        @NameInMap("ID")
        public Long ID;

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

        public DescribeDialogMessagesResponseBodyDialogList setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public DescribeDialogMessagesResponseBodyDialogList setID(Long ID) {
            this.ID = ID;
            return this;
        }
        public Long getID() {
            return this.ID;
        }

    }

}
