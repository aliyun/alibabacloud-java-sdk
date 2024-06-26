// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSQLDetailsResponseBody extends TeaModel {
    /**
     * <p>The operation that you want to perform.<br>Set the value to <strong>DescribeSQLDetails</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <pre><code>http(s)://[Endpoint]/?Action=DescribeSQLDetails
     * &amp;TenantId=t2mr3oae0****
     * &amp;SQLId=8D6E84****0B8FB1823D199E2CA1****
     * &amp;Common request parameters
     * </code></pre>
     */
    @NameInMap("SQLDetails")
    public java.util.List<DescribeSQLDetailsResponseBodySQLDetails> SQLDetails;

    public static DescribeSQLDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLDetailsResponseBody self = new DescribeSQLDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLDetailsResponseBody setSQLDetails(java.util.List<DescribeSQLDetailsResponseBodySQLDetails> SQLDetails) {
        this.SQLDetails = SQLDetails;
        return this;
    }
    public java.util.List<DescribeSQLDetailsResponseBodySQLDetails> getSQLDetails() {
        return this.SQLDetails;
    }

    public static class DescribeSQLDetailsResponseBodySQLDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>testdb</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>{&quot;name&quot;:&quot;DescribeSQLDetails&quot;,&quot;product&quot;:&quot;OceanBasePro&quot;,&quot;version&quot;:&quot;2019-09-01&quot;,&quot;path&quot;:&quot;/&quot;,&quot;deprecated&quot;:0,&quot;method&quot;:&quot;POST|GET&quot;,&quot;protocol&quot;:&quot;HTTP|HTTPS&quot;,&quot;hidden&quot;:0,&quot;timeout&quot;:10000,&quot;parameter_type&quot;:&quot;Single&quot;,&quot;params&quot;:&quot;[{\&quot;name\&quot;:\&quot;Action\&quot;,\&quot;position\&quot;:\&quot;Query\&quot;,\&quot;required\&quot;:true,\&quot;checkBlank\&quot;:false,\&quot;visibility\&quot;:\&quot;Public\&quot;,\&quot;deprecated\&quot;:false,\&quot;type\&quot;:\&quot;String\&quot;,\&quot;description\&quot;:\&quot;\&quot;,\&quot;example\&quot;:\&quot;DescribeSQLDetails\&quot;},{\&quot;name\&quot;:\&quot;TenantId\&quot;,\&quot;position\&quot;:\&quot;Body\&quot;,\&quot;required\&quot;:true,\&quot;checkBlank\&quot;:false,\&quot;visibility\&quot;:\&quot;Public\&quot;,\&quot;deprecated\&quot;:false,\&quot;type\&quot;:\&quot;String\&quot;,\&quot;title\&quot;:\&quot;\&quot;,\&quot;description\&quot;:\&quot;\&quot;,\&quot;example\&quot;:\&quot;t2mr3oae0****\&quot;},{\&quot;name\&quot;:\&quot;SQLId\&quot;,\&quot;position\&quot;:\&quot;Body\&quot;,\&quot;required\&quot;:true,\&quot;checkBlank\&quot;:false,\&quot;visibility\&quot;:\&quot;Public\&quot;,\&quot;deprecated\&quot;:false,\&quot;type\&quot;:\&quot;String\&quot;,\&quot;title\&quot;:\&quot;SQLID\&quot;,\&quot;description\&quot;:\&quot;SQLID。\&quot;,\&quot;example\&quot;:\&quot;8D6E84<strong><strong>0B8FB1823D199E2CA1</strong></strong>\&quot;}]&quot;,&quot;response_headers&quot;:&quot;[]&quot;,&quot;response&quot;:&quot;{\&quot;type\&quot;:\&quot;Object\&quot;,\&quot;children\&quot;:[{\&quot;name\&quot;:\&quot;RequestId\&quot;,\&quot;required\&quot;:false,\&quot;checkBlank\&quot;:false,\&quot;visibility\&quot;:\&quot;Public\&quot;,\&quot;deprecated\&quot;:false,\&quot;type\&quot;:\&quot;String\&quot;,\&quot;title\&quot;:\&quot;\&quot;,\&quot;description\&quot;:\&quot;\&quot;,\&quot;example\&quot;:\&quot;473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E\&quot;},{\&quot;name\&quot;:\&quot;SQLDetails\&quot;,\&quot;required\&quot;:false,\&quot;checkBlank\&quot;:false,\&quot;visibility\&quot;:\&quot;Public\&quot;,\&quot;deprecated\&quot;:false,\&quot;type\&quot;:\&quot;Array\&quot;,\&quot;subType\&quot;:\&quot;Object\&quot;,\&quot;description\&quot;:\&quot;  \&quot;,\&quot;children\&quot;:[{\&quot;name\&quot;:\&quot;SQLText\&quot;,\&quot;required\&quot;:false,\&quot;checkBlank\&quot;:false,\&quot;visibility\&quot;:\&quot;Public\&quot;,\&quot;deprecated\&quot;:false,\&quot;type\&quot;:\&quot;String\&quot;,\&quot;title\&quot;:\&quot;\&quot;,\&quot;description\&quot;:\&quot;\&quot;,\&quot;example\&quot;:\&quot;SELECT  ****   FROM ****   WHERE **** = ? AND **** = ?   ORDER BY **** ASC\&quot;},{\&quot;name\&quot;:\&quot;DbName\&quot;,\&quot;required\&quot;:false,\&quot;checkBlank\&quot;:false,\&quot;visibility\&quot;:\&quot;Public\&quot;,\&quot;deprecated\&quot;:false,\&quot;type\&quot;:\&quot;String\&quot;,\&quot;title\&quot;:\&quot;\&quot;,\&quot;description\&quot;:\&quot;\&quot;,\&quot;example\&quot;:\&quot;testdb\&quot;},{\&quot;name\&quot;:\&quot;UserName\&quot;,\&quot;required\&quot;:false,\&quot;checkBlank\&quot;:false,\&quot;visibility\&quot;:\&quot;Public\&quot;,\&quot;deprecated\&quot;:false,\&quot;type\&quot;:\&quot;String\&quot;,\&quot;title\&quot;:\&quot;\&quot;,\&quot;description\&quot;:\&quot;\&quot;,\&quot;example\&quot;:\&quot;tester\&quot;}],\&quot;title\&quot;:\&quot;\&quot;}],\&quot;title\&quot;:\&quot;\&quot;,\&quot;description\&quot;:\&quot;\&quot;}&quot;,&quot;errors&quot;:&quot;{}&quot;}</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT  ****   FROM ****   WHERE **** = ? AND **** = ?   ORDER BY **** ASC</p>
         */
        @NameInMap("SQLText")
        public String SQLText;

        /**
         * <strong>example:</strong>
         * <p>tester</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeSQLDetailsResponseBodySQLDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLDetailsResponseBodySQLDetails self = new DescribeSQLDetailsResponseBodySQLDetails();
            return TeaModel.build(map, self);
        }

        public DescribeSQLDetailsResponseBodySQLDetails setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeSQLDetailsResponseBodySQLDetails setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSQLDetailsResponseBodySQLDetails setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
