// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBInitializeVariableResponseBody extends TeaModel {
    /**
     * <p>The type of the database engine. Valid values:</p>
     * <br>
     * <p>*   Oracle</p>
     * <p>*   PostgreSQL</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The version of the database engine.</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The attributes that are returned.</p>
     */
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
        /**
         * <p>The character set that is supported.</p>
         */
        @NameInMap("Charset")
        public String charset;

        /**
         * <p>The language that indicates the collation of the databases that are created.</p>
         * <br>
         * <p>>- The language must be compatible with the character set that is specified by **CharacterSetName**.</p>
         * <p>>- This parameter is required for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters.</p>
         * <p>>- This parameter is optional for PolarDB for MySQL clusters.</p>
         * <br>
         * <p>To view the valid values for this parameter, perform the following steps: Log on to the PolarDB console and click the ID of a cluster. In the left-side navigation pane, choose **Settings and Management** > **Databases**. Then, click **Create Database**.</p>
         */
        @NameInMap("Collate")
        public String collate;

        /**
         * <p>The language that indicates the character type of the database.</p>
         * <br>
         * <p>>- The language must be compatible with the character set that is specified by **CharacterSetName**.</p>
         * <p>>- The specified value must be the same as the value of **Collate**.</p>
         * <p>>- This parameter is required for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters.</p>
         * <p>>- This parameter is optional for PolarDB for MySQL clusters.</p>
         * <br>
         * <p>To view the valid values for this parameter, perform the following steps: Log on to the PolarDB console and click the ID of a cluster. In the left-side navigation pane, choose **Settings and Management** > **Databases**. Then, click **Create Database**.</p>
         */
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
