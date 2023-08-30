// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDocTypesResponseBody extends TeaModel {
    @NameInMap("DocTypeList")
    public java.util.List<DescribeDocTypesResponseBodyDocTypeList> docTypeList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDocTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDocTypesResponseBody self = new DescribeDocTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDocTypesResponseBody setDocTypeList(java.util.List<DescribeDocTypesResponseBodyDocTypeList> docTypeList) {
        this.docTypeList = docTypeList;
        return this;
    }
    public java.util.List<DescribeDocTypesResponseBodyDocTypeList> getDocTypeList() {
        return this.docTypeList;
    }

    public DescribeDocTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDocTypesResponseBodyDocTypeList extends TeaModel {
        @NameInMap("Code")
        public Long code;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static DescribeDocTypesResponseBodyDocTypeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDocTypesResponseBodyDocTypeList self = new DescribeDocTypesResponseBodyDocTypeList();
            return TeaModel.build(map, self);
        }

        public DescribeDocTypesResponseBodyDocTypeList setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public DescribeDocTypesResponseBodyDocTypeList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDocTypesResponseBodyDocTypeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
