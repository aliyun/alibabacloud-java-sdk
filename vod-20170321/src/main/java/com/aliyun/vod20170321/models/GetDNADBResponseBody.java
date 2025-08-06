// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDNADBResponseBody extends TeaModel {
    @NameInMap("DNADB")
    public GetDNADBResponseBodyDNADB DNADB;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDNADBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDNADBResponseBody self = new GetDNADBResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDNADBResponseBody setDNADB(GetDNADBResponseBodyDNADB DNADB) {
        this.DNADB = DNADB;
        return this;
    }
    public GetDNADBResponseBodyDNADB getDNADB() {
        return this.DNADB;
    }

    public GetDNADBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDNADBResponseBodyDNADB extends TeaModel {
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

        public static GetDNADBResponseBodyDNADB build(java.util.Map<String, ?> map) throws Exception {
            GetDNADBResponseBodyDNADB self = new GetDNADBResponseBodyDNADB();
            return TeaModel.build(map, self);
        }

        public GetDNADBResponseBodyDNADB setDBDescription(String DBDescription) {
            this.DBDescription = DBDescription;
            return this;
        }
        public String getDBDescription() {
            return this.DBDescription;
        }

        public GetDNADBResponseBodyDNADB setDBId(String DBId) {
            this.DBId = DBId;
            return this;
        }
        public String getDBId() {
            return this.DBId;
        }

        public GetDNADBResponseBodyDNADB setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public GetDNADBResponseBodyDNADB setDBRegion(String DBRegion) {
            this.DBRegion = DBRegion;
            return this;
        }
        public String getDBRegion() {
            return this.DBRegion;
        }

        public GetDNADBResponseBodyDNADB setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public GetDNADBResponseBodyDNADB setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
