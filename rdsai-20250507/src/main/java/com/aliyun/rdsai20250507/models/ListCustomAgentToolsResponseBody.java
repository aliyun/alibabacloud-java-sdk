// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListCustomAgentToolsResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListCustomAgentToolsResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>32DEFB4A-861F-5D1D-ADD5-918E4FD7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCustomAgentToolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomAgentToolsResponseBody self = new ListCustomAgentToolsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomAgentToolsResponseBody setData(java.util.List<ListCustomAgentToolsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCustomAgentToolsResponseBodyData> getData() {
        return this.data;
    }

    public ListCustomAgentToolsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCustomAgentToolsResponseBodyData extends TeaModel {
        /**
         * <p>The description in English.</p>
         * 
         * <strong>example:</strong>
         * <p>Queries RDS instances.</p>
         */
        @NameInMap("En")
        public String en;

        /**
         * <p>The description in Japanese.</p>
         */
        @NameInMap("Ja")
        public String ja;

        /**
         * <p>The tool name.</p>
         * 
         * <strong>example:</strong>
         * <p>describe_db_instances</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The description in Traditional Chinese.</p>
         */
        @NameInMap("Tc")
        public String tc;

        /**
         * <p>The read/write type of the tool.</p>
         * 
         * <strong>example:</strong>
         * <p>get</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The description in Simplified Chinese.</p>
         */
        @NameInMap("Zh")
        public String zh;

        public static ListCustomAgentToolsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCustomAgentToolsResponseBodyData self = new ListCustomAgentToolsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCustomAgentToolsResponseBodyData setEn(String en) {
            this.en = en;
            return this;
        }
        public String getEn() {
            return this.en;
        }

        public ListCustomAgentToolsResponseBodyData setJa(String ja) {
            this.ja = ja;
            return this;
        }
        public String getJa() {
            return this.ja;
        }

        public ListCustomAgentToolsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCustomAgentToolsResponseBodyData setTc(String tc) {
            this.tc = tc;
            return this;
        }
        public String getTc() {
            return this.tc;
        }

        public ListCustomAgentToolsResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListCustomAgentToolsResponseBodyData setZh(String zh) {
            this.zh = zh;
            return this;
        }
        public String getZh() {
            return this.zh;
        }

    }

}
