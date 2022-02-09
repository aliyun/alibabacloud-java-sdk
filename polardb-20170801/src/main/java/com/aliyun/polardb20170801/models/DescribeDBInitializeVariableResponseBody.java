// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBInitializeVariableResponseBody extends TeaModel {
    @NameInMap("DBType")
    public String DBType;

    @NameInMap("DBVersion")
    public String DBVersion;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Variables")
    public DescribeDBInitializeVariableResponseBodyVariables variables;

    public static DescribeDBInitializeVariableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInitializeVariableResponseBody self = new DescribeDBInitializeVariableResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInitializeVariableResponseBody setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public DescribeDBInitializeVariableResponseBody setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public DescribeDBInitializeVariableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInitializeVariableResponseBody setVariables(DescribeDBInitializeVariableResponseBodyVariables variables) {
        this.variables = variables;
        return this;
    }
    public DescribeDBInitializeVariableResponseBodyVariables getVariables() {
        return this.variables;
    }

    public static class DescribeDBInitializeVariableResponseBodyVariablesVariable extends TeaModel {
        @NameInMap("Charset")
        public String charset;

        @NameInMap("Collate")
        public String collate;

        @NameInMap("Ctype")
        public String ctype;

        public static DescribeDBInitializeVariableResponseBodyVariablesVariable build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInitializeVariableResponseBodyVariablesVariable self = new DescribeDBInitializeVariableResponseBodyVariablesVariable();
            return TeaModel.build(map, self);
        }

        public DescribeDBInitializeVariableResponseBodyVariablesVariable setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public DescribeDBInitializeVariableResponseBodyVariablesVariable setCollate(String collate) {
            this.collate = collate;
            return this;
        }
        public String getCollate() {
            return this.collate;
        }

        public DescribeDBInitializeVariableResponseBodyVariablesVariable setCtype(String ctype) {
            this.ctype = ctype;
            return this;
        }
        public String getCtype() {
            return this.ctype;
        }

    }

    public static class DescribeDBInitializeVariableResponseBodyVariables extends TeaModel {
        @NameInMap("Variable")
        public java.util.List<DescribeDBInitializeVariableResponseBodyVariablesVariable> variable;

        public static DescribeDBInitializeVariableResponseBodyVariables build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInitializeVariableResponseBodyVariables self = new DescribeDBInitializeVariableResponseBodyVariables();
            return TeaModel.build(map, self);
        }

        public DescribeDBInitializeVariableResponseBodyVariables setVariable(java.util.List<DescribeDBInitializeVariableResponseBodyVariablesVariable> variable) {
            this.variable = variable;
            return this;
        }
        public java.util.List<DescribeDBInitializeVariableResponseBodyVariablesVariable> getVariable() {
            return this.variable;
        }

    }

}
