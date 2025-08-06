// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListDNADBResponseBody extends TeaModel {
    @NameInMap("DNADBList")
    public java.util.List<ListDNADBResponseBodyDNADBList> DNADBList;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDNADBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDNADBResponseBody self = new ListDNADBResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDNADBResponseBody setDNADBList(java.util.List<ListDNADBResponseBodyDNADBList> DNADBList) {
        this.DNADBList = DNADBList;
        return this;
    }
    public java.util.List<ListDNADBResponseBodyDNADBList> getDNADBList() {
        return this.DNADBList;
    }

    public ListDNADBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDNADBResponseBodyDNADBList extends TeaModel {
        @NameInMap("DBDescription")
        public String DBDescription;

        @NameInMap("DBId")
        public String DBId;

        @NameInMap("DBName")
        public String DBName;

        @NameInMap("DBRegion")
        public String DBRegion;

        @NameInMap("DBType")
        public String DBType;

        @NameInMap("Status")
        public String status;

        public static ListDNADBResponseBodyDNADBList build(java.util.Map<String, ?> map) throws Exception {
            ListDNADBResponseBodyDNADBList self = new ListDNADBResponseBodyDNADBList();
            return TeaModel.build(map, self);
        }

        public ListDNADBResponseBodyDNADBList setDBDescription(String DBDescription) {
            this.DBDescription = DBDescription;
            return this;
        }
        public String getDBDescription() {
            return this.DBDescription;
        }

        public ListDNADBResponseBodyDNADBList setDBId(String DBId) {
            this.DBId = DBId;
            return this;
        }
        public String getDBId() {
            return this.DBId;
        }

        public ListDNADBResponseBodyDNADBList setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public ListDNADBResponseBodyDNADBList setDBRegion(String DBRegion) {
            this.DBRegion = DBRegion;
            return this;
        }
        public String getDBRegion() {
            return this.DBRegion;
        }

        public ListDNADBResponseBodyDNADBList setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public ListDNADBResponseBodyDNADBList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
