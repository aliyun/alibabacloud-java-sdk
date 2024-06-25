// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBInitializeVariableResponseBody extends TeaModel {
    /**
     * <p>The type of the database engine. Valid values:</p>
     * <ul>
     * <li>Oracle</li>
     * <li>PostgreSQL</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostgreSQL</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The version of the database engine.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>475F58B7-F394-4394-AA6E-4F1CBA******</p>
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
         * 
         * <strong>example:</strong>
         * <p>EUC_CN</p>
         */
        @NameInMap("Charset")
        public String charset;

        /**
         * <p>The language that indicates the collation of the databases that are created.</p>
         * <blockquote>
         * <ul>
         * <li>The language must be compatible with the character set that is specified by <strong>CharacterSetName</strong>.</li>
         * <li>This parameter is required for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters.</li>
         * <li>This parameter is optional for PolarDB for MySQL clusters.</li>
         * </ul>
         * </blockquote>
         * <p>To view the valid values for this parameter, perform the following steps: Log on to the PolarDB console and click the ID of a cluster. In the left-side navigation pane, choose <strong>Settings and Management</strong> &gt; <strong>Databases</strong>. Then, click <strong>Create Database</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>C</p>
         */
        @NameInMap("Collate")
        public String collate;

        /**
         * <p>The language that indicates the character type of the database.</p>
         * <blockquote>
         * <ul>
         * <li>The language must be compatible with the character set that is specified by <strong>CharacterSetName</strong>.</li>
         * <li>The specified value must be the same as the value of <strong>Collate</strong>.</li>
         * <li>This parameter is required for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters.</li>
         * <li>This parameter is optional for PolarDB for MySQL clusters.</li>
         * </ul>
         * </blockquote>
         * <p>To view the valid values for this parameter, perform the following steps: Log on to the PolarDB console and click the ID of a cluster. In the left-side navigation pane, choose <strong>Settings and Management</strong> &gt; <strong>Databases</strong>. Then, click <strong>Create Database</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>C</p>
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
