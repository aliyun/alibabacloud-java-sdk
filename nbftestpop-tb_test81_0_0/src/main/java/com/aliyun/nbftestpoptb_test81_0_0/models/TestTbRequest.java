// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpoptb_test81_0_0.models;

import com.aliyun.tea.*;

public class TestTbRequest extends TeaModel {
    @NameInMap("query")
    public TestTbRequestQuery query;

    public static TestTbRequest build(java.util.Map<String, ?> map) throws Exception {
        TestTbRequest self = new TestTbRequest();
        return TeaModel.build(map, self);
    }

    public TestTbRequest setQuery(TestTbRequestQuery query) {
        this.query = query;
        return this;
    }
    public TestTbRequestQuery getQuery() {
        return this.query;
    }

    public static class TestTbRequestQueryDto extends TeaModel {
        @NameInMap("big")
        public Float big;

        @NameInMap("date")
        public Long date;

        @NameInMap("dou")
        public Float dou;

        @NameInMap("test")
        public String test;

        public static TestTbRequestQueryDto build(java.util.Map<String, ?> map) throws Exception {
            TestTbRequestQueryDto self = new TestTbRequestQueryDto();
            return TeaModel.build(map, self);
        }

        public TestTbRequestQueryDto setBig(Float big) {
            this.big = big;
            return this;
        }
        public Float getBig() {
            return this.big;
        }

        public TestTbRequestQueryDto setDate(Long date) {
            this.date = date;
            return this;
        }
        public Long getDate() {
            return this.date;
        }

        public TestTbRequestQueryDto setDou(Float dou) {
            this.dou = dou;
            return this;
        }
        public Float getDou() {
            return this.dou;
        }

        public TestTbRequestQueryDto setTest(String test) {
            this.test = test;
            return this;
        }
        public String getTest() {
            return this.test;
        }

    }

    public static class TestTbRequestQuery extends TeaModel {
        @NameInMap("dto")
        public TestTbRequestQueryDto dto;

        @NameInMap("id")
        public Integer id;

        public static TestTbRequestQuery build(java.util.Map<String, ?> map) throws Exception {
            TestTbRequestQuery self = new TestTbRequestQuery();
            return TeaModel.build(map, self);
        }

        public TestTbRequestQuery setDto(TestTbRequestQueryDto dto) {
            this.dto = dto;
            return this;
        }
        public TestTbRequestQueryDto getDto() {
            return this.dto;
        }

        public TestTbRequestQuery setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

}
