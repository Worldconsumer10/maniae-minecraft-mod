package com.maniae.mobs.selino;

import com.maniae.mobs.selino.SelinofosEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class SelinoModel extends EntityModel<SelinofosEntity> {
	private final ModelPart body;
	private final ModelPart torso;
	private final ModelPart tail;
	private final ModelPart barb;
	private final ModelPart spike;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftWing;
	private final ModelPart joint1;
	private final ModelPart joint2;
	private final ModelPart joint3;
	private final ModelPart joint4;
	private final ModelPart Talon;
	private final ModelPart claw;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart claw3;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;
	private final ModelPart claw4;
	private final ModelPart cube_r5;
	private final ModelPart cube_r6;
	private final ModelPart rightWing;
	private final ModelPart joint5;
	private final ModelPart joint6;
	private final ModelPart joint7;
	private final ModelPart joint8;
	private final ModelPart Talon2;
	private final ModelPart claw2;
	private final ModelPart cube_r7;
	private final ModelPart cube_r8;
	private final ModelPart claw5;
	private final ModelPart cube_r9;
	private final ModelPart cube_r10;
	private final ModelPart claw6;
	private final ModelPart cube_r11;
	private final ModelPart cube_r12;
	private final ModelPart leg2;
	private final ModelPart cube_r13;
	private final ModelPart cube_r14;
	private final ModelPart leg3;
	private final ModelPart cube_r15;
	private final ModelPart cube_r16;
	private final ModelPart spikeFeatures;
	private final ModelPart spine_spike3;
	private final ModelPart cube_r17;
	private final ModelPart cube_r18;
	private final ModelPart cube_r19;
	private final ModelPart cube_r20;
	private final ModelPart cube_r21;
	private final ModelPart cube_r22;
	private final ModelPart cube_r23;
	private final ModelPart cube_r24;
	private final ModelPart cube_r25;
	private final ModelPart cube_r26;
	private final ModelPart cube_r27;
	private final ModelPart cube_r28;
	private final ModelPart cube_r29;
	private final ModelPart cube_r30;
	private final ModelPart cube_r31;
	private final ModelPart cube_r32;
	private final ModelPart cube_r33;
	private final ModelPart cube_r34;
	private final ModelPart cube_r35;
	private final ModelPart cube_r36;
	private final ModelPart cube_r37;
	private final ModelPart cube_r38;
	private final ModelPart cube_r39;
	private final ModelPart cube_r40;
	private final ModelPart cube_r41;
	private final ModelPart cube_r42;
	private final ModelPart cube_r43;
	private final ModelPart cube_r44;
	private final ModelPart cube_r45;
	private final ModelPart cube_r46;
	private final ModelPart spine_spike2;
	private final ModelPart cube_r47;
	private final ModelPart cube_r48;
	private final ModelPart cube_r49;
	private final ModelPart cube_r50;
	private final ModelPart cube_r51;
	private final ModelPart cube_r52;
	private final ModelPart cube_r53;
	private final ModelPart cube_r54;
	private final ModelPart cube_r55;
	private final ModelPart cube_r56;
	private final ModelPart cube_r57;
	private final ModelPart cube_r58;
	private final ModelPart cube_r59;
	private final ModelPart cube_r60;
	private final ModelPart cube_r61;
	private final ModelPart cube_r62;
	private final ModelPart cube_r63;
	private final ModelPart cube_r64;
	private final ModelPart cube_r65;
	private final ModelPart cube_r66;
	private final ModelPart cube_r67;
	private final ModelPart spine_spike4;
	private final ModelPart cube_r68;
	private final ModelPart cube_r69;
	private final ModelPart cube_r70;
	private final ModelPart cube_r71;
	private final ModelPart cube_r72;
	private final ModelPart cube_r73;
	private final ModelPart cube_r74;
	private final ModelPart cube_r75;
	private final ModelPart cube_r76;
	private final ModelPart cube_r77;
	private final ModelPart cube_r78;
	private final ModelPart cube_r79;
	private final ModelPart cube_r80;
	private final ModelPart cube_r81;
	private final ModelPart cube_r82;
	private final ModelPart cube_r83;
	private final ModelPart cube_r84;
	private final ModelPart cube_r85;
	private final ModelPart cube_r86;
	private final ModelPart cube_r87;
	private final ModelPart cube_r88;
	private final ModelPart spine_spike5;
	private final ModelPart cube_r89;
	private final ModelPart cube_r90;
	private final ModelPart cube_r91;
	private final ModelPart cube_r92;
	private final ModelPart cube_r93;
	private final ModelPart cube_r94;
	private final ModelPart cube_r95;
	private final ModelPart cube_r96;
	private final ModelPart cube_r97;
	private final ModelPart cube_r98;
	private final ModelPart cube_r99;
	private final ModelPart cube_r100;
	private final ModelPart cube_r101;
	private final ModelPart cube_r102;
	private final ModelPart cube_r103;
	private final ModelPart cube_r104;
	private final ModelPart cube_r105;
	private final ModelPart cube_r106;
	private final ModelPart cube_r107;
	private final ModelPart cube_r108;
	private final ModelPart cube_r109;
	private final ModelPart spine_spike6;
	private final ModelPart cube_r110;
	private final ModelPart cube_r111;
	private final ModelPart cube_r112;
	private final ModelPart cube_r113;
	private final ModelPart cube_r114;
	private final ModelPart cube_r115;
	private final ModelPart cube_r116;
	private final ModelPart cube_r117;
	private final ModelPart cube_r118;
	private final ModelPart cube_r119;
	private final ModelPart cube_r120;
	private final ModelPart cube_r121;
	private final ModelPart cube_r122;
	private final ModelPart cube_r123;
	private final ModelPart cube_r124;
	private final ModelPart cube_r125;
	private final ModelPart cube_r126;
	private final ModelPart cube_r127;
	private final ModelPart cube_r128;
	private final ModelPart cube_r129;
	private final ModelPart cube_r130;
	private final ModelPart spine_spike7;
	private final ModelPart cube_r131;
	private final ModelPart cube_r132;
	private final ModelPart cube_r133;
	private final ModelPart cube_r134;
	private final ModelPart cube_r135;
	private final ModelPart cube_r136;
	private final ModelPart cube_r137;
	private final ModelPart cube_r138;
	private final ModelPart cube_r139;
	private final ModelPart cube_r140;
	private final ModelPart cube_r141;
	private final ModelPart cube_r142;
	private final ModelPart cube_r143;
	private final ModelPart cube_r144;
	private final ModelPart cube_r145;
	private final ModelPart cube_r146;
	private final ModelPart cube_r147;
	private final ModelPart cube_r148;
	private final ModelPart cube_r149;
	private final ModelPart cube_r150;
	private final ModelPart cube_r151;
	private final ModelPart spine_spike8;
	private final ModelPart cube_r152;
	private final ModelPart cube_r153;
	private final ModelPart cube_r154;
	private final ModelPart cube_r155;
	private final ModelPart cube_r156;
	private final ModelPart cube_r157;
	private final ModelPart cube_r158;
	private final ModelPart cube_r159;
	private final ModelPart cube_r160;
	private final ModelPart cube_r161;
	private final ModelPart cube_r162;
	private final ModelPart cube_r163;
	private final ModelPart cube_r164;
	private final ModelPart cube_r165;
	private final ModelPart cube_r166;
	private final ModelPart cube_r167;
	private final ModelPart cube_r168;
	private final ModelPart cube_r169;
	private final ModelPart cube_r170;
	private final ModelPart cube_r171;
	private final ModelPart cube_r172;
	private final ModelPart spine_spike9;
	private final ModelPart cube_r173;
	private final ModelPart cube_r174;
	private final ModelPart cube_r175;
	private final ModelPart cube_r176;
	private final ModelPart cube_r177;
	private final ModelPart cube_r178;
	private final ModelPart cube_r179;
	private final ModelPart cube_r180;
	private final ModelPart cube_r181;
	private final ModelPart cube_r182;
	private final ModelPart cube_r183;
	private final ModelPart cube_r184;
	private final ModelPart cube_r185;
	private final ModelPart cube_r186;
	private final ModelPart cube_r187;
	private final ModelPart cube_r188;
	private final ModelPart cube_r189;
	private final ModelPart cube_r190;
	private final ModelPart cube_r191;
	private final ModelPart cube_r192;
	private final ModelPart cube_r193;
	private final ModelPart spine_spike10;
	private final ModelPart cube_r194;
	private final ModelPart cube_r195;
	private final ModelPart cube_r196;
	private final ModelPart cube_r197;
	private final ModelPart cube_r198;
	private final ModelPart cube_r199;
	private final ModelPart cube_r200;
	private final ModelPart cube_r201;
	private final ModelPart cube_r202;
	private final ModelPart cube_r203;
	private final ModelPart cube_r204;
	private final ModelPart cube_r205;
	private final ModelPart cube_r206;
	private final ModelPart cube_r207;
	private final ModelPart cube_r208;
	private final ModelPart cube_r209;
	private final ModelPart cube_r210;
	private final ModelPart cube_r211;
	private final ModelPart cube_r212;
	private final ModelPart cube_r213;
	private final ModelPart cube_r214;
	private final ModelPart spine_spike11;
	private final ModelPart cube_r215;
	private final ModelPart cube_r216;
	private final ModelPart cube_r217;
	private final ModelPart cube_r218;
	private final ModelPart cube_r219;
	private final ModelPart cube_r220;
	private final ModelPart cube_r221;
	private final ModelPart cube_r222;
	private final ModelPart cube_r223;
	private final ModelPart cube_r224;
	private final ModelPart cube_r225;
	private final ModelPart cube_r226;
	private final ModelPart cube_r227;
	private final ModelPart cube_r228;
	private final ModelPart cube_r229;
	private final ModelPart cube_r230;
	private final ModelPart cube_r231;
	private final ModelPart cube_r232;
	private final ModelPart cube_r233;
	private final ModelPart cube_r234;
	private final ModelPart cube_r235;
	private final ModelPart single_spike;
	private final ModelPart cube_r236;
	private final ModelPart cube_r237;
	private final ModelPart cube_r238;
	private final ModelPart single_spike2;
	private final ModelPart cube_r239;
	private final ModelPart cube_r240;
	private final ModelPart cube_r241;
	private final ModelPart single_spike3;
	private final ModelPart cube_r242;
	private final ModelPart cube_r243;
	private final ModelPart cube_r244;
	private final ModelPart single_spike4;
	private final ModelPart cube_r245;
	private final ModelPart cube_r246;
	private final ModelPart cube_r247;
	private final ModelPart single_spike5;
	private final ModelPart cube_r248;
	private final ModelPart cube_r249;
	private final ModelPart cube_r250;
	private final ModelPart single_spike6;
	private final ModelPart cube_r251;
	private final ModelPart cube_r252;
	private final ModelPart cube_r253;
	private final ModelPart single_spike7;
	private final ModelPart cube_r254;
	private final ModelPart cube_r255;
	private final ModelPart cube_r256;
	private final ModelPart single_spike8;
	private final ModelPart cube_r257;
	private final ModelPart cube_r258;
	private final ModelPart cube_r259;
	private final ModelPart single_spike9;
	private final ModelPart cube_r260;
	private final ModelPart cube_r261;
	private final ModelPart cube_r262;
	private final ModelPart single_spike10;
	private final ModelPart cube_r263;
	private final ModelPart cube_r264;
	private final ModelPart cube_r265;
	private final ModelPart horn;
	private final ModelPart cube_r266;
	private final ModelPart cube_r267;
	private final ModelPart cube_r268;
	private final ModelPart cube_r269;
	private final ModelPart horn2;
	private final ModelPart cube_r270;
	private final ModelPart cube_r271;
	private final ModelPart cube_r272;
	private final ModelPart cube_r273;
	private final ModelPart horn3;
	private final ModelPart cube_r274;
	private final ModelPart cube_r275;
	private final ModelPart cube_r276;
	private final ModelPart cube_r277;
	private final ModelPart horn4;
	private final ModelPart cube_r278;
	private final ModelPart cube_r279;
	private final ModelPart cube_r280;
	private final ModelPart cube_r281;
	private final ModelPart horn5;
	private final ModelPart cube_r282;
	private final ModelPart cube_r283;
	private final ModelPart cube_r284;
	private final ModelPart cube_r285;
	private final ModelPart cube_r286;
	private final ModelPart cube_r287;
	private final ModelPart horn6;
	private final ModelPart cube_r288;
	private final ModelPart cube_r289;
	private final ModelPart cube_r290;
	private final ModelPart cube_r291;
	private final ModelPart cube_r292;
	private final ModelPart cube_r293;
	private final ModelPart horn8;
	private final ModelPart cube_r294;
	private final ModelPart cube_r295;
	private final ModelPart cube_r296;
	private final ModelPart cube_r297;
	private final ModelPart cube_r298;
	private final ModelPart cube_r299;
	private final ModelPart horn7;
	private final ModelPart cube_r300;
	private final ModelPart cube_r301;
	private final ModelPart cube_r302;
	private final ModelPart cube_r303;
	private final ModelPart cube_r304;
	private final ModelPart cube_r305;
	private final ModelPart horn9;
	private final ModelPart cube_r306;
	private final ModelPart cube_r307;
	private final ModelPart cube_r308;
	private final ModelPart cube_r309;
	private final ModelPart cube_r310;
	private final ModelPart cube_r311;
	public SelinoModel(ModelPart root) {
		this.body = root.getChild("body");
		this.torso = this.body.getChild("torso");
		this.tail = this.body.getChild("tail");
		this.barb = this.tail.getChild("barb");
		this.spike = this.barb.getChild("spike");
		this.neck = this.body.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftWing = this.body.getChild("leftWing");
		this.joint1 = this.leftWing.getChild("joint1");
		this.joint2 = this.joint1.getChild("joint2");
		this.joint3 = this.joint2.getChild("joint3");
		this.joint4 = this.joint3.getChild("joint4");
		this.Talon = this.joint2.getChild("Talon");
		this.claw = this.Talon.getChild("claw");
		this.cube_r1 = this.claw.getChild("cube_r1");
		this.cube_r2 = this.claw.getChild("cube_r2");
		this.claw3 = this.Talon.getChild("claw3");
		this.cube_r3 = this.claw3.getChild("cube_r3");
		this.cube_r4 = this.claw3.getChild("cube_r4");
		this.claw4 = this.Talon.getChild("claw4");
		this.cube_r5 = this.claw4.getChild("cube_r5");
		this.cube_r6 = this.claw4.getChild("cube_r6");
		this.rightWing = this.body.getChild("rightWing");
		this.joint5 = this.rightWing.getChild("joint5");
		this.joint6 = this.joint5.getChild("joint6");
		this.joint7 = this.joint6.getChild("joint7");
		this.joint8 = this.joint7.getChild("joint8");
		this.Talon2 = this.joint6.getChild("Talon2");
		this.claw2 = this.Talon2.getChild("claw2");
		this.cube_r7 = this.claw2.getChild("cube_r7");
		this.cube_r8 = this.claw2.getChild("cube_r8");
		this.claw5 = this.Talon2.getChild("claw5");
		this.cube_r9 = this.claw5.getChild("cube_r9");
		this.cube_r10 = this.claw5.getChild("cube_r10");
		this.claw6 = this.Talon2.getChild("claw6");
		this.cube_r11 = this.claw6.getChild("cube_r11");
		this.cube_r12 = this.claw6.getChild("cube_r12");
		this.leg2 = this.body.getChild("leg2");
		this.cube_r13 = this.leg2.getChild("cube_r13");
		this.cube_r14 = this.leg2.getChild("cube_r14");
		this.leg3 = this.body.getChild("leg3");
		this.cube_r15 = this.leg3.getChild("cube_r15");
		this.cube_r16 = this.leg3.getChild("cube_r16");
		this.spikeFeatures = this.body.getChild("spikeFeatures");
		this.spine_spike3 = this.spikeFeatures.getChild("spine_spike3");
		this.cube_r17 = this.spine_spike3.getChild("cube_r17");
		this.cube_r18 = this.spine_spike3.getChild("cube_r18");
		this.cube_r19 = this.spine_spike3.getChild("cube_r19");
		this.cube_r20 = this.spine_spike3.getChild("cube_r20");
		this.cube_r21 = this.spine_spike3.getChild("cube_r21");
		this.cube_r22 = this.spine_spike3.getChild("cube_r22");
		this.cube_r23 = this.spine_spike3.getChild("cube_r23");
		this.cube_r24 = this.spine_spike3.getChild("cube_r24");
		this.cube_r25 = this.spine_spike3.getChild("cube_r25");
		this.cube_r26 = this.spine_spike3.getChild("cube_r26");
		this.cube_r27 = this.spine_spike3.getChild("cube_r27");
		this.cube_r28 = this.spine_spike3.getChild("cube_r28");
		this.cube_r29 = this.spine_spike3.getChild("cube_r29");
		this.cube_r30 = this.spine_spike3.getChild("cube_r30");
		this.cube_r31 = this.spine_spike3.getChild("cube_r31");
		this.cube_r32 = this.spine_spike3.getChild("cube_r32");
		this.cube_r33 = this.spine_spike3.getChild("cube_r33");
		this.cube_r34 = this.spine_spike3.getChild("cube_r34");
		this.cube_r35 = this.spine_spike3.getChild("cube_r35");
		this.cube_r36 = this.spine_spike3.getChild("cube_r36");
		this.cube_r37 = this.spine_spike3.getChild("cube_r37");
		this.cube_r38 = this.spine_spike3.getChild("cube_r38");
		this.cube_r39 = this.spine_spike3.getChild("cube_r39");
		this.cube_r40 = this.spine_spike3.getChild("cube_r40");
		this.cube_r41 = this.spine_spike3.getChild("cube_r41");
		this.cube_r42 = this.spine_spike3.getChild("cube_r42");
		this.cube_r43 = this.spine_spike3.getChild("cube_r43");
		this.cube_r44 = this.spine_spike3.getChild("cube_r44");
		this.cube_r45 = this.spine_spike3.getChild("cube_r45");
		this.cube_r46 = this.spine_spike3.getChild("cube_r46");
		this.spine_spike2 = this.spikeFeatures.getChild("spine_spike2");
		this.cube_r47 = this.spine_spike2.getChild("cube_r47");
		this.cube_r48 = this.spine_spike2.getChild("cube_r48");
		this.cube_r49 = this.spine_spike2.getChild("cube_r49");
		this.cube_r50 = this.spine_spike2.getChild("cube_r50");
		this.cube_r51 = this.spine_spike2.getChild("cube_r51");
		this.cube_r52 = this.spine_spike2.getChild("cube_r52");
		this.cube_r53 = this.spine_spike2.getChild("cube_r53");
		this.cube_r54 = this.spine_spike2.getChild("cube_r54");
		this.cube_r55 = this.spine_spike2.getChild("cube_r55");
		this.cube_r56 = this.spine_spike2.getChild("cube_r56");
		this.cube_r57 = this.spine_spike2.getChild("cube_r57");
		this.cube_r58 = this.spine_spike2.getChild("cube_r58");
		this.cube_r59 = this.spine_spike2.getChild("cube_r59");
		this.cube_r60 = this.spine_spike2.getChild("cube_r60");
		this.cube_r61 = this.spine_spike2.getChild("cube_r61");
		this.cube_r62 = this.spine_spike2.getChild("cube_r62");
		this.cube_r63 = this.spine_spike2.getChild("cube_r63");
		this.cube_r64 = this.spine_spike2.getChild("cube_r64");
		this.cube_r65 = this.spine_spike2.getChild("cube_r65");
		this.cube_r66 = this.spine_spike2.getChild("cube_r66");
		this.cube_r67 = this.spine_spike2.getChild("cube_r67");
		this.spine_spike4 = this.spikeFeatures.getChild("spine_spike4");
		this.cube_r68 = this.spine_spike4.getChild("cube_r68");
		this.cube_r69 = this.spine_spike4.getChild("cube_r69");
		this.cube_r70 = this.spine_spike4.getChild("cube_r70");
		this.cube_r71 = this.spine_spike4.getChild("cube_r71");
		this.cube_r72 = this.spine_spike4.getChild("cube_r72");
		this.cube_r73 = this.spine_spike4.getChild("cube_r73");
		this.cube_r74 = this.spine_spike4.getChild("cube_r74");
		this.cube_r75 = this.spine_spike4.getChild("cube_r75");
		this.cube_r76 = this.spine_spike4.getChild("cube_r76");
		this.cube_r77 = this.spine_spike4.getChild("cube_r77");
		this.cube_r78 = this.spine_spike4.getChild("cube_r78");
		this.cube_r79 = this.spine_spike4.getChild("cube_r79");
		this.cube_r80 = this.spine_spike4.getChild("cube_r80");
		this.cube_r81 = this.spine_spike4.getChild("cube_r81");
		this.cube_r82 = this.spine_spike4.getChild("cube_r82");
		this.cube_r83 = this.spine_spike4.getChild("cube_r83");
		this.cube_r84 = this.spine_spike4.getChild("cube_r84");
		this.cube_r85 = this.spine_spike4.getChild("cube_r85");
		this.cube_r86 = this.spine_spike4.getChild("cube_r86");
		this.cube_r87 = this.spine_spike4.getChild("cube_r87");
		this.cube_r88 = this.spine_spike4.getChild("cube_r88");
		this.spine_spike5 = this.spikeFeatures.getChild("spine_spike5");
		this.cube_r89 = this.spine_spike5.getChild("cube_r89");
		this.cube_r90 = this.spine_spike5.getChild("cube_r90");
		this.cube_r91 = this.spine_spike5.getChild("cube_r91");
		this.cube_r92 = this.spine_spike5.getChild("cube_r92");
		this.cube_r93 = this.spine_spike5.getChild("cube_r93");
		this.cube_r94 = this.spine_spike5.getChild("cube_r94");
		this.cube_r95 = this.spine_spike5.getChild("cube_r95");
		this.cube_r96 = this.spine_spike5.getChild("cube_r96");
		this.cube_r97 = this.spine_spike5.getChild("cube_r97");
		this.cube_r98 = this.spine_spike5.getChild("cube_r98");
		this.cube_r99 = this.spine_spike5.getChild("cube_r99");
		this.cube_r100 = this.spine_spike5.getChild("cube_r100");
		this.cube_r101 = this.spine_spike5.getChild("cube_r101");
		this.cube_r102 = this.spine_spike5.getChild("cube_r102");
		this.cube_r103 = this.spine_spike5.getChild("cube_r103");
		this.cube_r104 = this.spine_spike5.getChild("cube_r104");
		this.cube_r105 = this.spine_spike5.getChild("cube_r105");
		this.cube_r106 = this.spine_spike5.getChild("cube_r106");
		this.cube_r107 = this.spine_spike5.getChild("cube_r107");
		this.cube_r108 = this.spine_spike5.getChild("cube_r108");
		this.cube_r109 = this.spine_spike5.getChild("cube_r109");
		this.spine_spike6 = this.spikeFeatures.getChild("spine_spike6");
		this.cube_r110 = this.spine_spike6.getChild("cube_r110");
		this.cube_r111 = this.spine_spike6.getChild("cube_r111");
		this.cube_r112 = this.spine_spike6.getChild("cube_r112");
		this.cube_r113 = this.spine_spike6.getChild("cube_r113");
		this.cube_r114 = this.spine_spike6.getChild("cube_r114");
		this.cube_r115 = this.spine_spike6.getChild("cube_r115");
		this.cube_r116 = this.spine_spike6.getChild("cube_r116");
		this.cube_r117 = this.spine_spike6.getChild("cube_r117");
		this.cube_r118 = this.spine_spike6.getChild("cube_r118");
		this.cube_r119 = this.spine_spike6.getChild("cube_r119");
		this.cube_r120 = this.spine_spike6.getChild("cube_r120");
		this.cube_r121 = this.spine_spike6.getChild("cube_r121");
		this.cube_r122 = this.spine_spike6.getChild("cube_r122");
		this.cube_r123 = this.spine_spike6.getChild("cube_r123");
		this.cube_r124 = this.spine_spike6.getChild("cube_r124");
		this.cube_r125 = this.spine_spike6.getChild("cube_r125");
		this.cube_r126 = this.spine_spike6.getChild("cube_r126");
		this.cube_r127 = this.spine_spike6.getChild("cube_r127");
		this.cube_r128 = this.spine_spike6.getChild("cube_r128");
		this.cube_r129 = this.spine_spike6.getChild("cube_r129");
		this.cube_r130 = this.spine_spike6.getChild("cube_r130");
		this.spine_spike7 = this.spikeFeatures.getChild("spine_spike7");
		this.cube_r131 = this.spine_spike7.getChild("cube_r131");
		this.cube_r132 = this.spine_spike7.getChild("cube_r132");
		this.cube_r133 = this.spine_spike7.getChild("cube_r133");
		this.cube_r134 = this.spine_spike7.getChild("cube_r134");
		this.cube_r135 = this.spine_spike7.getChild("cube_r135");
		this.cube_r136 = this.spine_spike7.getChild("cube_r136");
		this.cube_r137 = this.spine_spike7.getChild("cube_r137");
		this.cube_r138 = this.spine_spike7.getChild("cube_r138");
		this.cube_r139 = this.spine_spike7.getChild("cube_r139");
		this.cube_r140 = this.spine_spike7.getChild("cube_r140");
		this.cube_r141 = this.spine_spike7.getChild("cube_r141");
		this.cube_r142 = this.spine_spike7.getChild("cube_r142");
		this.cube_r143 = this.spine_spike7.getChild("cube_r143");
		this.cube_r144 = this.spine_spike7.getChild("cube_r144");
		this.cube_r145 = this.spine_spike7.getChild("cube_r145");
		this.cube_r146 = this.spine_spike7.getChild("cube_r146");
		this.cube_r147 = this.spine_spike7.getChild("cube_r147");
		this.cube_r148 = this.spine_spike7.getChild("cube_r148");
		this.cube_r149 = this.spine_spike7.getChild("cube_r149");
		this.cube_r150 = this.spine_spike7.getChild("cube_r150");
		this.cube_r151 = this.spine_spike7.getChild("cube_r151");
		this.spine_spike8 = this.spikeFeatures.getChild("spine_spike8");
		this.cube_r152 = this.spine_spike8.getChild("cube_r152");
		this.cube_r153 = this.spine_spike8.getChild("cube_r153");
		this.cube_r154 = this.spine_spike8.getChild("cube_r154");
		this.cube_r155 = this.spine_spike8.getChild("cube_r155");
		this.cube_r156 = this.spine_spike8.getChild("cube_r156");
		this.cube_r157 = this.spine_spike8.getChild("cube_r157");
		this.cube_r158 = this.spine_spike8.getChild("cube_r158");
		this.cube_r159 = this.spine_spike8.getChild("cube_r159");
		this.cube_r160 = this.spine_spike8.getChild("cube_r160");
		this.cube_r161 = this.spine_spike8.getChild("cube_r161");
		this.cube_r162 = this.spine_spike8.getChild("cube_r162");
		this.cube_r163 = this.spine_spike8.getChild("cube_r163");
		this.cube_r164 = this.spine_spike8.getChild("cube_r164");
		this.cube_r165 = this.spine_spike8.getChild("cube_r165");
		this.cube_r166 = this.spine_spike8.getChild("cube_r166");
		this.cube_r167 = this.spine_spike8.getChild("cube_r167");
		this.cube_r168 = this.spine_spike8.getChild("cube_r168");
		this.cube_r169 = this.spine_spike8.getChild("cube_r169");
		this.cube_r170 = this.spine_spike8.getChild("cube_r170");
		this.cube_r171 = this.spine_spike8.getChild("cube_r171");
		this.cube_r172 = this.spine_spike8.getChild("cube_r172");
		this.spine_spike9 = this.spikeFeatures.getChild("spine_spike9");
		this.cube_r173 = this.spine_spike9.getChild("cube_r173");
		this.cube_r174 = this.spine_spike9.getChild("cube_r174");
		this.cube_r175 = this.spine_spike9.getChild("cube_r175");
		this.cube_r176 = this.spine_spike9.getChild("cube_r176");
		this.cube_r177 = this.spine_spike9.getChild("cube_r177");
		this.cube_r178 = this.spine_spike9.getChild("cube_r178");
		this.cube_r179 = this.spine_spike9.getChild("cube_r179");
		this.cube_r180 = this.spine_spike9.getChild("cube_r180");
		this.cube_r181 = this.spine_spike9.getChild("cube_r181");
		this.cube_r182 = this.spine_spike9.getChild("cube_r182");
		this.cube_r183 = this.spine_spike9.getChild("cube_r183");
		this.cube_r184 = this.spine_spike9.getChild("cube_r184");
		this.cube_r185 = this.spine_spike9.getChild("cube_r185");
		this.cube_r186 = this.spine_spike9.getChild("cube_r186");
		this.cube_r187 = this.spine_spike9.getChild("cube_r187");
		this.cube_r188 = this.spine_spike9.getChild("cube_r188");
		this.cube_r189 = this.spine_spike9.getChild("cube_r189");
		this.cube_r190 = this.spine_spike9.getChild("cube_r190");
		this.cube_r191 = this.spine_spike9.getChild("cube_r191");
		this.cube_r192 = this.spine_spike9.getChild("cube_r192");
		this.cube_r193 = this.spine_spike9.getChild("cube_r193");
		this.spine_spike10 = this.spikeFeatures.getChild("spine_spike10");
		this.cube_r194 = this.spine_spike10.getChild("cube_r194");
		this.cube_r195 = this.spine_spike10.getChild("cube_r195");
		this.cube_r196 = this.spine_spike10.getChild("cube_r196");
		this.cube_r197 = this.spine_spike10.getChild("cube_r197");
		this.cube_r198 = this.spine_spike10.getChild("cube_r198");
		this.cube_r199 = this.spine_spike10.getChild("cube_r199");
		this.cube_r200 = this.spine_spike10.getChild("cube_r200");
		this.cube_r201 = this.spine_spike10.getChild("cube_r201");
		this.cube_r202 = this.spine_spike10.getChild("cube_r202");
		this.cube_r203 = this.spine_spike10.getChild("cube_r203");
		this.cube_r204 = this.spine_spike10.getChild("cube_r204");
		this.cube_r205 = this.spine_spike10.getChild("cube_r205");
		this.cube_r206 = this.spine_spike10.getChild("cube_r206");
		this.cube_r207 = this.spine_spike10.getChild("cube_r207");
		this.cube_r208 = this.spine_spike10.getChild("cube_r208");
		this.cube_r209 = this.spine_spike10.getChild("cube_r209");
		this.cube_r210 = this.spine_spike10.getChild("cube_r210");
		this.cube_r211 = this.spine_spike10.getChild("cube_r211");
		this.cube_r212 = this.spine_spike10.getChild("cube_r212");
		this.cube_r213 = this.spine_spike10.getChild("cube_r213");
		this.cube_r214 = this.spine_spike10.getChild("cube_r214");
		this.spine_spike11 = this.spikeFeatures.getChild("spine_spike11");
		this.cube_r215 = this.spine_spike11.getChild("cube_r215");
		this.cube_r216 = this.spine_spike11.getChild("cube_r216");
		this.cube_r217 = this.spine_spike11.getChild("cube_r217");
		this.cube_r218 = this.spine_spike11.getChild("cube_r218");
		this.cube_r219 = this.spine_spike11.getChild("cube_r219");
		this.cube_r220 = this.spine_spike11.getChild("cube_r220");
		this.cube_r221 = this.spine_spike11.getChild("cube_r221");
		this.cube_r222 = this.spine_spike11.getChild("cube_r222");
		this.cube_r223 = this.spine_spike11.getChild("cube_r223");
		this.cube_r224 = this.spine_spike11.getChild("cube_r224");
		this.cube_r225 = this.spine_spike11.getChild("cube_r225");
		this.cube_r226 = this.spine_spike11.getChild("cube_r226");
		this.cube_r227 = this.spine_spike11.getChild("cube_r227");
		this.cube_r228 = this.spine_spike11.getChild("cube_r228");
		this.cube_r229 = this.spine_spike11.getChild("cube_r229");
		this.cube_r230 = this.spine_spike11.getChild("cube_r230");
		this.cube_r231 = this.spine_spike11.getChild("cube_r231");
		this.cube_r232 = this.spine_spike11.getChild("cube_r232");
		this.cube_r233 = this.spine_spike11.getChild("cube_r233");
		this.cube_r234 = this.spine_spike11.getChild("cube_r234");
		this.cube_r235 = this.spine_spike11.getChild("cube_r235");
		this.single_spike = this.spikeFeatures.getChild("single_spike");
		this.cube_r236 = this.single_spike.getChild("cube_r236");
		this.cube_r237 = this.single_spike.getChild("cube_r237");
		this.cube_r238 = this.single_spike.getChild("cube_r238");
		this.single_spike2 = this.spikeFeatures.getChild("single_spike2");
		this.cube_r239 = this.single_spike2.getChild("cube_r239");
		this.cube_r240 = this.single_spike2.getChild("cube_r240");
		this.cube_r241 = this.single_spike2.getChild("cube_r241");
		this.single_spike3 = this.spikeFeatures.getChild("single_spike3");
		this.cube_r242 = this.single_spike3.getChild("cube_r242");
		this.cube_r243 = this.single_spike3.getChild("cube_r243");
		this.cube_r244 = this.single_spike3.getChild("cube_r244");
		this.single_spike4 = this.spikeFeatures.getChild("single_spike4");
		this.cube_r245 = this.single_spike4.getChild("cube_r245");
		this.cube_r246 = this.single_spike4.getChild("cube_r246");
		this.cube_r247 = this.single_spike4.getChild("cube_r247");
		this.single_spike5 = this.spikeFeatures.getChild("single_spike5");
		this.cube_r248 = this.single_spike5.getChild("cube_r248");
		this.cube_r249 = this.single_spike5.getChild("cube_r249");
		this.cube_r250 = this.single_spike5.getChild("cube_r250");
		this.single_spike6 = this.spikeFeatures.getChild("single_spike6");
		this.cube_r251 = this.single_spike6.getChild("cube_r251");
		this.cube_r252 = this.single_spike6.getChild("cube_r252");
		this.cube_r253 = this.single_spike6.getChild("cube_r253");
		this.single_spike7 = this.spikeFeatures.getChild("single_spike7");
		this.cube_r254 = this.single_spike7.getChild("cube_r254");
		this.cube_r255 = this.single_spike7.getChild("cube_r255");
		this.cube_r256 = this.single_spike7.getChild("cube_r256");
		this.single_spike8 = this.spikeFeatures.getChild("single_spike8");
		this.cube_r257 = this.single_spike8.getChild("cube_r257");
		this.cube_r258 = this.single_spike8.getChild("cube_r258");
		this.cube_r259 = this.single_spike8.getChild("cube_r259");
		this.single_spike9 = this.spikeFeatures.getChild("single_spike9");
		this.cube_r260 = this.single_spike9.getChild("cube_r260");
		this.cube_r261 = this.single_spike9.getChild("cube_r261");
		this.cube_r262 = this.single_spike9.getChild("cube_r262");
		this.single_spike10 = this.spikeFeatures.getChild("single_spike10");
		this.cube_r263 = this.single_spike10.getChild("cube_r263");
		this.cube_r264 = this.single_spike10.getChild("cube_r264");
		this.cube_r265 = this.single_spike10.getChild("cube_r265");
		this.horn = this.spikeFeatures.getChild("horn");
		this.cube_r266 = this.horn.getChild("cube_r266");
		this.cube_r267 = this.horn.getChild("cube_r267");
		this.cube_r268 = this.horn.getChild("cube_r268");
		this.cube_r269 = this.horn.getChild("cube_r269");
		this.horn2 = this.spikeFeatures.getChild("horn2");
		this.cube_r270 = this.horn2.getChild("cube_r270");
		this.cube_r271 = this.horn2.getChild("cube_r271");
		this.cube_r272 = this.horn2.getChild("cube_r272");
		this.cube_r273 = this.horn2.getChild("cube_r273");
		this.horn3 = this.spikeFeatures.getChild("horn3");
		this.cube_r274 = this.horn3.getChild("cube_r274");
		this.cube_r275 = this.horn3.getChild("cube_r275");
		this.cube_r276 = this.horn3.getChild("cube_r276");
		this.cube_r277 = this.horn3.getChild("cube_r277");
		this.horn4 = this.spikeFeatures.getChild("horn4");
		this.cube_r278 = this.horn4.getChild("cube_r278");
		this.cube_r279 = this.horn4.getChild("cube_r279");
		this.cube_r280 = this.horn4.getChild("cube_r280");
		this.cube_r281 = this.horn4.getChild("cube_r281");
		this.horn5 = this.spikeFeatures.getChild("horn5");
		this.cube_r282 = this.horn5.getChild("cube_r282");
		this.cube_r283 = this.horn5.getChild("cube_r283");
		this.cube_r284 = this.horn5.getChild("cube_r284");
		this.cube_r285 = this.horn5.getChild("cube_r285");
		this.cube_r286 = this.horn5.getChild("cube_r286");
		this.cube_r287 = this.horn5.getChild("cube_r287");
		this.horn6 = this.spikeFeatures.getChild("horn6");
		this.cube_r288 = this.horn6.getChild("cube_r288");
		this.cube_r289 = this.horn6.getChild("cube_r289");
		this.cube_r290 = this.horn6.getChild("cube_r290");
		this.cube_r291 = this.horn6.getChild("cube_r291");
		this.cube_r292 = this.horn6.getChild("cube_r292");
		this.cube_r293 = this.horn6.getChild("cube_r293");
		this.horn8 = this.spikeFeatures.getChild("horn8");
		this.cube_r294 = this.horn8.getChild("cube_r294");
		this.cube_r295 = this.horn8.getChild("cube_r295");
		this.cube_r296 = this.horn8.getChild("cube_r296");
		this.cube_r297 = this.horn8.getChild("cube_r297");
		this.cube_r298 = this.horn8.getChild("cube_r298");
		this.cube_r299 = this.horn8.getChild("cube_r299");
		this.horn7 = this.spikeFeatures.getChild("horn7");
		this.cube_r300 = this.horn7.getChild("cube_r300");
		this.cube_r301 = this.horn7.getChild("cube_r301");
		this.cube_r302 = this.horn7.getChild("cube_r302");
		this.cube_r303 = this.horn7.getChild("cube_r303");
		this.cube_r304 = this.horn7.getChild("cube_r304");
		this.cube_r305 = this.horn7.getChild("cube_r305");
		this.horn9 = this.spikeFeatures.getChild("horn9");
		this.cube_r306 = this.horn9.getChild("cube_r306");
		this.cube_r307 = this.horn9.getChild("cube_r307");
		this.cube_r308 = this.horn9.getChild("cube_r308");
		this.cube_r309 = this.horn9.getChild("cube_r309");
		this.cube_r310 = this.horn9.getChild("cube_r310");
		this.cube_r311 = this.horn9.getChild("cube_r311");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(-1.0F, -86.0F, -4.5F));

		ModelPartData torso = body.addChild("torso", ModelPartBuilder.create().uv(0, 154).cuboid(-43.0F, -80.0F, -54.0F, 50.0F, 44.0F, 99.0F, new Dilation(0.0F)), ModelTransform.pivot(18.0F, 58.0F, 4.5F));

		ModelPartData tail = body.addChild("tail", ModelPartBuilder.create().uv(292, 335).cuboid(-35.0F, -75.0F, 14.0F, 34.0F, 34.0F, 68.0F, new Dilation(0.0F))
				.uv(112, 319).cuboid(-33.0F, -73.0F, 82.0F, 30.0F, 30.0F, 68.0F, new Dilation(0.0F))
				.uv(0, 297).cuboid(-31.0F, -71.0F, 150.0F, 26.0F, 26.0F, 68.0F, new Dilation(0.0F))
				.uv(230, 245).cuboid(-29.0F, -69.0F, 218.0F, 22.0F, 22.0F, 68.0F, new Dilation(0.0F))
				.uv(230, 245).cuboid(-27.0F, -67.0F, 286.0F, 18.0F, 18.0F, 68.0F, new Dilation(0.0F))
				.uv(230, 245).cuboid(-25.0F, -65.0F, 354.0F, 14.0F, 14.0F, 68.0F, new Dilation(0.0F))
				.uv(230, 245).cuboid(-23.0F, -63.0F, 422.0F, 10.0F, 10.0F, 68.0F, new Dilation(0.0F))
				.uv(230, 245).cuboid(-21.0F, -61.0F, 490.0F, 6.0F, 6.0F, 68.0F, new Dilation(0.0F))
				.uv(260, 275).cuboid(-20.0F, -60.0F, 558.0F, 4.0F, 4.0F, 38.0F, new Dilation(0.0F)), ModelTransform.pivot(18.0F, 58.0F, 35.5F));

		ModelPartData barb = tail.addChild("barb", ModelPartBuilder.create(), ModelTransform.pivot(-18.0F, -57.3F, 634.0F));

		ModelPartData spike = barb.addChild("spike", ModelPartBuilder.create().uv(260, 275).cuboid(-1.5F, -2.3F, -38.0F, 3.0F, 3.2F, 38.0F, new Dilation(0.0F))
				.uv(290, 305).cuboid(-1.1F, -1.9F, 0.0F, 2.2F, 2.4F, 8.0F, new Dilation(0.0F))
				.uv(291, 306).cuboid(-0.7F, -1.5F, 8.0F, 1.4F, 1.6F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData neck = body.addChild("neck", ModelPartBuilder.create().uv(260, 215).cuboid(-30.0F, -72.0F, -110.0F, 20.0F, 20.0F, 10.0F, new Dilation(0.0F))
				.uv(256, 211).cuboid(-36.0F, -76.0F, -68.0F, 32.0F, 32.0F, 14.0F, new Dilation(0.0F))
				.uv(255, 210).cuboid(-33.0F, -74.0F, -83.0F, 26.0F, 26.0F, 15.0F, new Dilation(0.0F))
				.uv(253, 208).cuboid(-31.0F, -73.0F, -100.0F, 22.0F, 22.0F, 17.0F, new Dilation(0.0F))
				.uv(258, 213).cuboid(-31.0F, -73.0F, -122.0F, 22.0F, 22.0F, 12.0F, new Dilation(0.0F))
				.uv(258, 213).cuboid(-33.0F, -73.0F, -134.0F, 26.0F, 26.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(18.0F, 58.0F, 4.5F));

		ModelPartData head = neck.addChild("head", ModelPartBuilder.create().uv(404, 289).cuboid(-37.0F, -74.0F, -171.0F, 34.0F, 28.0F, 46.0F, new Dilation(0.0F))
				.uv(8, 395).cuboid(-33.0F, -64.0F, -209.0F, 26.0F, 18.0F, 38.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -9.0F));

		ModelPartData leftWing = body.addChild("leftWing", ModelPartBuilder.create(), ModelTransform.pivot(1.0F, 110.0F, 4.5F));

		ModelPartData joint1 = leftWing.addChild("joint1", ModelPartBuilder.create().uv(-8, -8).cuboid(0.0F, -5.0F, -5.0F, 81.0F, 10.0F, 10.0F, new Dilation(0.0F))
				.uv(-3, 74).cuboid(1.0F, -0.1F, 0.0F, 79.0F, 0.1F, 80.0F, new Dilation(0.0F)), ModelTransform.pivot(24.0F, -123.0F, -44.0F));

		ModelPartData joint2 = joint1.addChild("joint2", ModelPartBuilder.create().uv(-6, -6).cuboid(0.0F, -4.0F, -4.0F, 141.0F, 8.0F, 8.0F, new Dilation(0.0F))
				.uv(-3, 74).cuboid(-1.0F, -0.1F, 0.0F, 141.0F, 0.1F, 80.0F, new Dilation(0.0F)), ModelTransform.pivot(81.0F, 0.0F, 0.0F));

		ModelPartData joint3 = joint2.addChild("joint3", ModelPartBuilder.create().uv(-4, -4).cuboid(0.0F, -3.0F, -3.0F, 97.0F, 6.0F, 6.0F, new Dilation(0.0F))
				.uv(-3, 74).cuboid(-1.0F, -0.1F, 0.0F, 97.0F, 0.1F, 80.0F, new Dilation(0.0F)), ModelTransform.pivot(141.0F, 0.0F, 0.0F));

		ModelPartData joint4 = joint3.addChild("joint4", ModelPartBuilder.create().uv(-2, -2).cuboid(0.0F, -2.0F, -2.0F, 95.0F, 4.0F, 4.0F, new Dilation(0.0F))
				.uv(-3, 74).cuboid(-1.0F, -0.1F, 0.0F, 97.0F, 0.1F, 80.0F, new Dilation(0.0F)), ModelTransform.pivot(97.0F, 0.0F, 0.0F));

		ModelPartData Talon = joint2.addChild("Talon", ModelPartBuilder.create(), ModelTransform.pivot(141.0F, -1.0F, -4.0F));

		ModelPartData claw = Talon.addChild("claw", ModelPartBuilder.create(), ModelTransform.pivot(0.3F, 0.0F, 0.0F));

		ModelPartData cube_r1 = claw.addChild("cube_r1", ModelPartBuilder.create().uv(-8, -8).cuboid(-0.01F, -2.0F, -8.0F, 0.01F, 4.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r2 = claw.addChild("cube_r2", ModelPartBuilder.create().uv(-8, -8).cuboid(-0.01F, 2.1F, -7.7F, 0.01F, 4.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -4.2099F, -13.352F, 1.2217F, 0.0F, 0.0F));

		ModelPartData claw3 = Talon.addChild("claw3", ModelPartBuilder.create(), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));

		ModelPartData cube_r3 = claw3.addChild("cube_r3", ModelPartBuilder.create().uv(-8, -8).cuboid(-0.01F, -2.0F, -8.0F, 0.01F, 4.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r4 = claw3.addChild("cube_r4", ModelPartBuilder.create().uv(-8, -8).cuboid(-0.01F, 2.1F, -7.7F, 0.01F, 4.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -4.2099F, -13.352F, 1.2217F, 0.0F, 0.0F));

		ModelPartData claw4 = Talon.addChild("claw4", ModelPartBuilder.create(), ModelTransform.of(0.6F, 0.0F, 0.0F, 0.0F, -0.3054F, 0.0F));

		ModelPartData cube_r5 = claw4.addChild("cube_r5", ModelPartBuilder.create().uv(-8, -8).cuboid(-0.01F, -2.0F, -8.0F, 0.01F, 4.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r6 = claw4.addChild("cube_r6", ModelPartBuilder.create().uv(-8, -8).cuboid(-0.01F, 2.1F, -7.7F, 0.01F, 4.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -4.2099F, -13.352F, 1.2217F, 0.0F, 0.0F));

		ModelPartData rightWing = body.addChild("rightWing", ModelPartBuilder.create(), ModelTransform.of(-25.0F, -13.025F, -39.5F, 0.0F, 0.0F, -3.1416F));

		ModelPartData joint5 = rightWing.addChild("joint5", ModelPartBuilder.create().uv(-8, -8).cuboid(-1.0F, -4.975F, -5.0F, 81.0F, 10.0F, 10.0F, new Dilation(0.0F))
				.uv(-3, 74).cuboid(0.0F, -0.075F, 0.0F, 79.0F, 0.1F, 80.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData joint6 = joint5.addChild("joint6", ModelPartBuilder.create().uv(-6, -6).cuboid(0.0F, -4.0F, -4.0F, 141.0F, 8.0F, 8.0F, new Dilation(0.0F))
				.uv(-3, 74).cuboid(-1.0F, -0.1F, 0.0F, 141.0F, 0.1F, 80.0F, new Dilation(0.0F)), ModelTransform.pivot(80.0F, 0.025F, 0.0F));

		ModelPartData joint7 = joint6.addChild("joint7", ModelPartBuilder.create().uv(-4, -4).cuboid(0.0F, -3.0F, -3.0F, 97.0F, 6.0F, 6.0F, new Dilation(0.0F))
				.uv(-3, 74).cuboid(-1.0F, -0.1F, 0.0F, 97.0F, 0.1F, 80.0F, new Dilation(0.0F)), ModelTransform.pivot(141.0F, 0.0F, 0.0F));

		ModelPartData joint8 = joint7.addChild("joint8", ModelPartBuilder.create().uv(-2, -2).cuboid(0.0F, -2.0F, -2.0F, 95.0F, 4.0F, 4.0F, new Dilation(0.0F))
				.uv(-3, 74).cuboid(-1.0F, -0.1F, 0.0F, 97.0F, 0.1F, 80.0F, new Dilation(0.0F)), ModelTransform.pivot(97.0F, 0.0F, 0.0F));

		ModelPartData Talon2 = joint6.addChild("Talon2", ModelPartBuilder.create(), ModelTransform.of(141.0F, -1.0F, -4.0F, 0.0F, 0.0F, -3.1416F));

		ModelPartData claw2 = Talon2.addChild("claw2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r7 = claw2.addChild("cube_r7", ModelPartBuilder.create().uv(-8, -8).cuboid(-0.01F, -2.0F, -8.0F, 0.01F, 4.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r8 = claw2.addChild("cube_r8", ModelPartBuilder.create().uv(-8, -8).cuboid(-0.01F, 2.1F, -7.7F, 0.01F, 4.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -4.2099F, -13.352F, 1.2217F, 0.0F, 0.0F));

		ModelPartData claw5 = Talon2.addChild("claw5", ModelPartBuilder.create(), ModelTransform.of(-0.25F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));

		ModelPartData cube_r9 = claw5.addChild("cube_r9", ModelPartBuilder.create().uv(-8, -8).cuboid(-0.01F, -2.0F, -8.0F, 0.01F, 4.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r10 = claw5.addChild("cube_r10", ModelPartBuilder.create().uv(-8, -8).cuboid(-0.01F, 2.1F, -7.7F, 0.01F, 4.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -4.2099F, -13.352F, 1.2217F, 0.0F, 0.0F));

		ModelPartData claw6 = Talon2.addChild("claw6", ModelPartBuilder.create(), ModelTransform.of(0.3F, 0.0F, 0.0F, 0.0F, -0.3054F, 0.0F));

		ModelPartData cube_r11 = claw6.addChild("cube_r11", ModelPartBuilder.create().uv(-8, -8).cuboid(-0.01F, -2.0F, -8.0F, 0.01F, 4.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r12 = claw6.addChild("cube_r12", ModelPartBuilder.create().uv(-8, -8).cuboid(-0.01F, 2.1F, -7.7F, 0.01F, 4.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -4.2099F, -13.352F, 1.2217F, 0.0F, 0.0F));

		ModelPartData leg2 = body.addChild("leg2", ModelPartBuilder.create().uv(342, 261).cuboid(-11.0F, -6.0F, -18.0F, 22.0F, 11.0F, 31.0F, new Dilation(0.0F)), ModelTransform.pivot(-32.0F, 110.0F, 33.5F));

		ModelPartData cube_r13 = leg2.addChild("cube_r13", ModelPartBuilder.create().uv(199, 154).cuboid(-8.0F, -39.5F, -9.5F, 16.0F, 52.0F, 19.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.5F, -0.5F, 0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r14 = leg2.addChild("cube_r14", ModelPartBuilder.create().uv(156, 409).cuboid(-10.0F, -55.5F, -25.5F, 20.0F, 49.0F, 25.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -36.5F, 0.5F, -0.2618F, 0.0F, 0.0F));

		ModelPartData leg3 = body.addChild("leg3", ModelPartBuilder.create().uv(224, 335).cuboid(-11.0F, -6.0F, -18.0F, 22.0F, 11.0F, 31.0F, new Dilation(0.0F)), ModelTransform.pivot(34.0F, 110.0F, 33.5F));

		ModelPartData cube_r15 = leg3.addChild("cube_r15", ModelPartBuilder.create().uv(0, 0).cuboid(-8.0F, -39.5F, -9.5F, 16.0F, 52.0F, 19.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.5F, -0.5F, 0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r16 = leg3.addChild("cube_r16", ModelPartBuilder.create().uv(0, 129).cuboid(-10.0F, -55.5F, -25.5F, 20.0F, 49.0F, 25.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -36.5F, 0.5F, -0.2618F, 0.0F, 0.0F));

		ModelPartData spikeFeatures = body.addChild("spikeFeatures", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -24.0F, -21.0F));

		ModelPartData spine_spike3 = spikeFeatures.addChild("spine_spike3", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r17 = spine_spike3.addChild("cube_r17", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 53.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r18 = spine_spike3.addChild("cube_r18", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 48.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r19 = spine_spike3.addChild("cube_r19", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 47.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r20 = spine_spike3.addChild("cube_r20", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 22.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r21 = spine_spike3.addChild("cube_r21", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 17.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r22 = spine_spike3.addChild("cube_r22", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 16.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r23 = spine_spike3.addChild("cube_r23", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, -6.8444F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r24 = spine_spike3.addChild("cube_r24", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, -11.25F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r25 = spine_spike3.addChild("cube_r25", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, -12.75F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r26 = spine_spike3.addChild("cube_r26", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 63.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r27 = spine_spike3.addChild("cube_r27", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 58.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r28 = spine_spike3.addChild("cube_r28", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 57.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r29 = spine_spike3.addChild("cube_r29", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 32.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r30 = spine_spike3.addChild("cube_r30", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 27.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r31 = spine_spike3.addChild("cube_r31", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 26.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r32 = spine_spike3.addChild("cube_r32", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 3.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r33 = spine_spike3.addChild("cube_r33", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, -1.25F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r34 = spine_spike3.addChild("cube_r34", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, -2.75F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r35 = spine_spike3.addChild("cube_r35", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 71.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r36 = spine_spike3.addChild("cube_r36", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 66.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r37 = spine_spike3.addChild("cube_r37", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 65.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r38 = spine_spike3.addChild("cube_r38", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 42.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r39 = spine_spike3.addChild("cube_r39", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 37.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r40 = spine_spike3.addChild("cube_r40", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 36.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r41 = spine_spike3.addChild("cube_r41", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 11.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r42 = spine_spike3.addChild("cube_r42", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 6.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r43 = spine_spike3.addChild("cube_r43", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 5.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r44 = spine_spike3.addChild("cube_r44", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, -17.8444F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r45 = spine_spike3.addChild("cube_r45", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, -22.25F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r46 = spine_spike3.addChild("cube_r46", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, -23.75F, -0.3054F, 0.0F, 0.0F));

		ModelPartData spine_spike2 = spikeFeatures.addChild("spine_spike2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 5.0F, 100.0F));

		ModelPartData cube_r47 = spine_spike2.addChild("cube_r47", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 20.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r48 = spine_spike2.addChild("cube_r48", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 15.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r49 = spine_spike2.addChild("cube_r49", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 14.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r50 = spine_spike2.addChild("cube_r50", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, -6.8444F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r51 = spine_spike2.addChild("cube_r51", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, -11.25F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r52 = spine_spike2.addChild("cube_r52", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, -12.75F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r53 = spine_spike2.addChild("cube_r53", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 29.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r54 = spine_spike2.addChild("cube_r54", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 24.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r55 = spine_spike2.addChild("cube_r55", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 23.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r56 = spine_spike2.addChild("cube_r56", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 3.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r57 = spine_spike2.addChild("cube_r57", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, -1.25F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r58 = spine_spike2.addChild("cube_r58", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, -2.75F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r59 = spine_spike2.addChild("cube_r59", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 38.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r60 = spine_spike2.addChild("cube_r60", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 33.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r61 = spine_spike2.addChild("cube_r61", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 32.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r62 = spine_spike2.addChild("cube_r62", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 11.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r63 = spine_spike2.addChild("cube_r63", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 6.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r64 = spine_spike2.addChild("cube_r64", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 5.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r65 = spine_spike2.addChild("cube_r65", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, -17.8444F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r66 = spine_spike2.addChild("cube_r66", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, -22.25F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r67 = spine_spike2.addChild("cube_r67", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, -23.75F, -0.3054F, 0.0F, 0.0F));

		ModelPartData spine_spike4 = spikeFeatures.addChild("spine_spike4", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 7.0F, 167.0F));

		ModelPartData cube_r68 = spine_spike4.addChild("cube_r68", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 20.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r69 = spine_spike4.addChild("cube_r69", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 15.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r70 = spine_spike4.addChild("cube_r70", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 14.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r71 = spine_spike4.addChild("cube_r71", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, -6.8444F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r72 = spine_spike4.addChild("cube_r72", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, -11.25F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r73 = spine_spike4.addChild("cube_r73", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, -12.75F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r74 = spine_spike4.addChild("cube_r74", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 29.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r75 = spine_spike4.addChild("cube_r75", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 24.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r76 = spine_spike4.addChild("cube_r76", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 23.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r77 = spine_spike4.addChild("cube_r77", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 2.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r78 = spine_spike4.addChild("cube_r78", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, -2.25F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r79 = spine_spike4.addChild("cube_r79", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, -3.75F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r80 = spine_spike4.addChild("cube_r80", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 38.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r81 = spine_spike4.addChild("cube_r81", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 33.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r82 = spine_spike4.addChild("cube_r82", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 32.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r83 = spine_spike4.addChild("cube_r83", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 11.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r84 = spine_spike4.addChild("cube_r84", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 6.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r85 = spine_spike4.addChild("cube_r85", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 5.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r86 = spine_spike4.addChild("cube_r86", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, -14.8444F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r87 = spine_spike4.addChild("cube_r87", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, -19.25F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r88 = spine_spike4.addChild("cube_r88", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, -20.75F, -0.3054F, 0.0F, 0.0F));

		ModelPartData spine_spike5 = spikeFeatures.addChild("spine_spike5", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 9.0F, 233.0F));

		ModelPartData cube_r89 = spine_spike5.addChild("cube_r89", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 20.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r90 = spine_spike5.addChild("cube_r90", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 15.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r91 = spine_spike5.addChild("cube_r91", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 14.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r92 = spine_spike5.addChild("cube_r92", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, -6.8444F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r93 = spine_spike5.addChild("cube_r93", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, -11.25F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r94 = spine_spike5.addChild("cube_r94", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, -12.75F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r95 = spine_spike5.addChild("cube_r95", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 29.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r96 = spine_spike5.addChild("cube_r96", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 24.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r97 = spine_spike5.addChild("cube_r97", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 23.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r98 = spine_spike5.addChild("cube_r98", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 2.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r99 = spine_spike5.addChild("cube_r99", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, -2.25F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r100 = spine_spike5.addChild("cube_r100", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, -3.75F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r101 = spine_spike5.addChild("cube_r101", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 38.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r102 = spine_spike5.addChild("cube_r102", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 33.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r103 = spine_spike5.addChild("cube_r103", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 32.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r104 = spine_spike5.addChild("cube_r104", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 11.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r105 = spine_spike5.addChild("cube_r105", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 6.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r106 = spine_spike5.addChild("cube_r106", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 5.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r107 = spine_spike5.addChild("cube_r107", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, -14.8444F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r108 = spine_spike5.addChild("cube_r108", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, -19.25F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r109 = spine_spike5.addChild("cube_r109", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, -20.75F, -0.3054F, 0.0F, 0.0F));

		ModelPartData spine_spike6 = spikeFeatures.addChild("spine_spike6", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 11.0F, 303.0F));

		ModelPartData cube_r110 = spine_spike6.addChild("cube_r110", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 20.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r111 = spine_spike6.addChild("cube_r111", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 15.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r112 = spine_spike6.addChild("cube_r112", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 14.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r113 = spine_spike6.addChild("cube_r113", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, -6.8444F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r114 = spine_spike6.addChild("cube_r114", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, -11.25F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r115 = spine_spike6.addChild("cube_r115", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, -12.75F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r116 = spine_spike6.addChild("cube_r116", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 29.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r117 = spine_spike6.addChild("cube_r117", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 24.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r118 = spine_spike6.addChild("cube_r118", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 23.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r119 = spine_spike6.addChild("cube_r119", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 2.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r120 = spine_spike6.addChild("cube_r120", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, -2.25F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r121 = spine_spike6.addChild("cube_r121", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, -3.75F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r122 = spine_spike6.addChild("cube_r122", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 38.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r123 = spine_spike6.addChild("cube_r123", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 33.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r124 = spine_spike6.addChild("cube_r124", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 32.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r125 = spine_spike6.addChild("cube_r125", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 11.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r126 = spine_spike6.addChild("cube_r126", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 6.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r127 = spine_spike6.addChild("cube_r127", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 5.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r128 = spine_spike6.addChild("cube_r128", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, -14.8444F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r129 = spine_spike6.addChild("cube_r129", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, -19.25F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r130 = spine_spike6.addChild("cube_r130", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, -20.75F, -0.3054F, 0.0F, 0.0F));

		ModelPartData spine_spike7 = spikeFeatures.addChild("spine_spike7", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 13.0F, 370.0F));

		ModelPartData cube_r131 = spine_spike7.addChild("cube_r131", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 20.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r132 = spine_spike7.addChild("cube_r132", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 15.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r133 = spine_spike7.addChild("cube_r133", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 14.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r134 = spine_spike7.addChild("cube_r134", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, -6.8444F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r135 = spine_spike7.addChild("cube_r135", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, -11.25F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r136 = spine_spike7.addChild("cube_r136", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, -12.75F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r137 = spine_spike7.addChild("cube_r137", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 29.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r138 = spine_spike7.addChild("cube_r138", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 24.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r139 = spine_spike7.addChild("cube_r139", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 23.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r140 = spine_spike7.addChild("cube_r140", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 1.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r141 = spine_spike7.addChild("cube_r141", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, -3.25F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r142 = spine_spike7.addChild("cube_r142", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, -4.75F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r143 = spine_spike7.addChild("cube_r143", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 38.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r144 = spine_spike7.addChild("cube_r144", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 33.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r145 = spine_spike7.addChild("cube_r145", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 32.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r146 = spine_spike7.addChild("cube_r146", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 11.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r147 = spine_spike7.addChild("cube_r147", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 6.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r148 = spine_spike7.addChild("cube_r148", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 5.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r149 = spine_spike7.addChild("cube_r149", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, -14.8444F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r150 = spine_spike7.addChild("cube_r150", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, -19.25F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r151 = spine_spike7.addChild("cube_r151", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, -20.75F, -0.3054F, 0.0F, 0.0F));

		ModelPartData spine_spike8 = spikeFeatures.addChild("spine_spike8", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 15.0F, 439.0F));

		ModelPartData cube_r152 = spine_spike8.addChild("cube_r152", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 20.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r153 = spine_spike8.addChild("cube_r153", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 15.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r154 = spine_spike8.addChild("cube_r154", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 14.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r155 = spine_spike8.addChild("cube_r155", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, -6.8444F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r156 = spine_spike8.addChild("cube_r156", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, -11.25F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r157 = spine_spike8.addChild("cube_r157", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, -12.75F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r158 = spine_spike8.addChild("cube_r158", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 29.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r159 = spine_spike8.addChild("cube_r159", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 24.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r160 = spine_spike8.addChild("cube_r160", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 23.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r161 = spine_spike8.addChild("cube_r161", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 2.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r162 = spine_spike8.addChild("cube_r162", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, -2.25F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r163 = spine_spike8.addChild("cube_r163", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, -3.75F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r164 = spine_spike8.addChild("cube_r164", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 38.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r165 = spine_spike8.addChild("cube_r165", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 33.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r166 = spine_spike8.addChild("cube_r166", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 32.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r167 = spine_spike8.addChild("cube_r167", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 11.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r168 = spine_spike8.addChild("cube_r168", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 6.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r169 = spine_spike8.addChild("cube_r169", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 5.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r170 = spine_spike8.addChild("cube_r170", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, -14.8444F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r171 = spine_spike8.addChild("cube_r171", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, -19.25F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r172 = spine_spike8.addChild("cube_r172", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, -20.75F, -0.3054F, 0.0F, 0.0F));

		ModelPartData spine_spike9 = spikeFeatures.addChild("spine_spike9", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 17.0F, 506.0F));

		ModelPartData cube_r173 = spine_spike9.addChild("cube_r173", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 20.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r174 = spine_spike9.addChild("cube_r174", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 15.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r175 = spine_spike9.addChild("cube_r175", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 14.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r176 = spine_spike9.addChild("cube_r176", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, -6.8444F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r177 = spine_spike9.addChild("cube_r177", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, -11.25F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r178 = spine_spike9.addChild("cube_r178", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, -12.75F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r179 = spine_spike9.addChild("cube_r179", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 29.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r180 = spine_spike9.addChild("cube_r180", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 24.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r181 = spine_spike9.addChild("cube_r181", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 23.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r182 = spine_spike9.addChild("cube_r182", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 2.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r183 = spine_spike9.addChild("cube_r183", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, -2.25F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r184 = spine_spike9.addChild("cube_r184", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, -3.75F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r185 = spine_spike9.addChild("cube_r185", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 38.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r186 = spine_spike9.addChild("cube_r186", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 33.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r187 = spine_spike9.addChild("cube_r187", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 32.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r188 = spine_spike9.addChild("cube_r188", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 11.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r189 = spine_spike9.addChild("cube_r189", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 6.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r190 = spine_spike9.addChild("cube_r190", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 5.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r191 = spine_spike9.addChild("cube_r191", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, -14.8444F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r192 = spine_spike9.addChild("cube_r192", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, -19.25F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r193 = spine_spike9.addChild("cube_r193", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, -20.75F, -0.3054F, 0.0F, 0.0F));

		ModelPartData spine_spike10 = spikeFeatures.addChild("spine_spike10", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 19.0F, 576.0F));

		ModelPartData cube_r194 = spine_spike10.addChild("cube_r194", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 20.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r195 = spine_spike10.addChild("cube_r195", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 15.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r196 = spine_spike10.addChild("cube_r196", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 14.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r197 = spine_spike10.addChild("cube_r197", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, -6.8444F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r198 = spine_spike10.addChild("cube_r198", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, -11.25F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r199 = spine_spike10.addChild("cube_r199", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, -12.75F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r200 = spine_spike10.addChild("cube_r200", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 29.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r201 = spine_spike10.addChild("cube_r201", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 24.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r202 = spine_spike10.addChild("cube_r202", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 23.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r203 = spine_spike10.addChild("cube_r203", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 2.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r204 = spine_spike10.addChild("cube_r204", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, -2.25F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r205 = spine_spike10.addChild("cube_r205", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, -3.75F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r206 = spine_spike10.addChild("cube_r206", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 38.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r207 = spine_spike10.addChild("cube_r207", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 33.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r208 = spine_spike10.addChild("cube_r208", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 32.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r209 = spine_spike10.addChild("cube_r209", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 11.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r210 = spine_spike10.addChild("cube_r210", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 6.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r211 = spine_spike10.addChild("cube_r211", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 5.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r212 = spine_spike10.addChild("cube_r212", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, -14.8444F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r213 = spine_spike10.addChild("cube_r213", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, -19.25F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r214 = spine_spike10.addChild("cube_r214", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, -20.75F, -0.3054F, 0.0F, 0.0F));

		ModelPartData spine_spike11 = spikeFeatures.addChild("spine_spike11", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 20.0F, 642.0F));

		ModelPartData cube_r215 = spine_spike11.addChild("cube_r215", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 27.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r216 = spine_spike11.addChild("cube_r216", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 22.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r217 = spine_spike11.addChild("cube_r217", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 21.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r218 = spine_spike11.addChild("cube_r218", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, -6.8444F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r219 = spine_spike11.addChild("cube_r219", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, -11.25F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r220 = spine_spike11.addChild("cube_r220", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, -12.75F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r221 = spine_spike11.addChild("cube_r221", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 36.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r222 = spine_spike11.addChild("cube_r222", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 31.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r223 = spine_spike11.addChild("cube_r223", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 30.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r224 = spine_spike11.addChild("cube_r224", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 2.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r225 = spine_spike11.addChild("cube_r225", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, -2.25F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r226 = spine_spike11.addChild("cube_r226", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, -3.75F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r227 = spine_spike11.addChild("cube_r227", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 45.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r228 = spine_spike11.addChild("cube_r228", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 40.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r229 = spine_spike11.addChild("cube_r229", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 39.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r230 = spine_spike11.addChild("cube_r230", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, 11.1556F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r231 = spine_spike11.addChild("cube_r231", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, 6.75F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r232 = spine_spike11.addChild("cube_r232", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, 5.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r233 = spine_spike11.addChild("cube_r233", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.7797F, -14.8444F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r234 = spine_spike11.addChild("cube_r234", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.15F, -19.25F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r235 = spine_spike11.addChild("cube_r235", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.25F, -20.75F, -0.3054F, 0.0F, 0.0F));

		ModelPartData single_spike = spikeFeatures.addChild("single_spike", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -10.7797F, -28.8444F));

		ModelPartData cube_r236 = single_spike.addChild("cube_r236", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r237 = single_spike.addChild("cube_r237", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 7.6297F, -4.4056F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r238 = single_spike.addChild("cube_r238", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 14.5297F, -5.9056F, -0.3054F, 0.0F, 0.0F));

		ModelPartData single_spike2 = spikeFeatures.addChild("single_spike2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -8.7797F, -39.8444F));

		ModelPartData cube_r239 = single_spike2.addChild("cube_r239", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r240 = single_spike2.addChild("cube_r240", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 7.6297F, -4.4056F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r241 = single_spike2.addChild("cube_r241", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 14.5297F, -5.9056F, -0.3054F, 0.0F, 0.0F));

		ModelPartData single_spike3 = spikeFeatures.addChild("single_spike3", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -8.7797F, -47.8444F));

		ModelPartData cube_r242 = single_spike3.addChild("cube_r242", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r243 = single_spike3.addChild("cube_r243", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 7.6297F, -4.4056F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r244 = single_spike3.addChild("cube_r244", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 14.5297F, -5.9056F, -0.3054F, 0.0F, 0.0F));

		ModelPartData single_spike4 = spikeFeatures.addChild("single_spike4", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -7.7797F, -54.8444F));

		ModelPartData cube_r245 = single_spike4.addChild("cube_r245", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r246 = single_spike4.addChild("cube_r246", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 7.6297F, -4.4056F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r247 = single_spike4.addChild("cube_r247", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 14.5297F, -5.9056F, -0.3054F, 0.0F, 0.0F));

		ModelPartData single_spike5 = spikeFeatures.addChild("single_spike5", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -7.7797F, -62.8444F));

		ModelPartData cube_r248 = single_spike5.addChild("cube_r248", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r249 = single_spike5.addChild("cube_r249", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 7.6297F, -4.4056F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r250 = single_spike5.addChild("cube_r250", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 14.5297F, -5.9056F, -0.3054F, 0.0F, 0.0F));

		ModelPartData single_spike6 = spikeFeatures.addChild("single_spike6", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -6.7797F, -72.8444F));

		ModelPartData cube_r251 = single_spike6.addChild("cube_r251", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r252 = single_spike6.addChild("cube_r252", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 7.6297F, -4.4056F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r253 = single_spike6.addChild("cube_r253", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 14.5297F, -5.9056F, -0.3054F, 0.0F, 0.0F));

		ModelPartData single_spike7 = spikeFeatures.addChild("single_spike7", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -7.7797F, -80.8444F));

		ModelPartData cube_r254 = single_spike7.addChild("cube_r254", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r255 = single_spike7.addChild("cube_r255", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 7.6297F, -4.4056F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r256 = single_spike7.addChild("cube_r256", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 14.5297F, -5.9056F, -0.3054F, 0.0F, 0.0F));

		ModelPartData single_spike8 = spikeFeatures.addChild("single_spike8", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -7.7797F, -86.8444F));

		ModelPartData cube_r257 = single_spike8.addChild("cube_r257", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r258 = single_spike8.addChild("cube_r258", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 7.6297F, -4.4056F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r259 = single_spike8.addChild("cube_r259", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 14.5297F, -5.9056F, -0.3054F, 0.0F, 0.0F));

		ModelPartData single_spike9 = spikeFeatures.addChild("single_spike9", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -7.7797F, -92.8444F));

		ModelPartData cube_r260 = single_spike9.addChild("cube_r260", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r261 = single_spike9.addChild("cube_r261", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 7.6297F, -4.4056F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r262 = single_spike9.addChild("cube_r262", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 14.5297F, -5.9056F, -0.3054F, 0.0F, 0.0F));

		ModelPartData single_spike10 = spikeFeatures.addChild("single_spike10", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -7.7797F, -98.8444F));

		ModelPartData cube_r263 = single_spike10.addChild("cube_r263", ModelPartBuilder.create().uv(1, 1).cuboid(-0.2F, 0.5F, 3.6F, 0.4F, 8.0F, 0.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r264 = single_spike10.addChild("cube_r264", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, 1.2F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 7.6297F, -4.4056F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r265 = single_spike10.addChild("cube_r265", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.5F, -1.0F, 1.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 14.5297F, -5.9056F, -0.3054F, 0.0F, 0.0F));

		ModelPartData horn = spikeFeatures.addChild("horn", ModelPartBuilder.create(), ModelTransform.of(-17.0F, 9.0303F, -110.5559F, 0.0F, 0.0F, -0.7854F));

		ModelPartData cube_r266 = horn.addChild("cube_r266", ModelPartBuilder.create().uv(0, 0).cuboid(-0.7F, -3.8F, -0.4F, 1.4F, 8.0F, 1.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -16.598F, 11.8735F, -0.9163F, 0.0F, 0.0F));

		ModelPartData cube_r267 = horn.addChild("cube_r267", ModelPartBuilder.create().uv(-1, -1).cuboid(-1.2F, 0.5F, 2.6F, 2.4F, 8.0F, 2.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -16.8101F, 6.7116F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r268 = horn.addChild("cube_r268", ModelPartBuilder.create().uv(-1, -1).cuboid(-1.5F, 0.0F, 0.2F, 3.0F, 6.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -9.1803F, 2.3059F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r269 = horn.addChild("cube_r269", ModelPartBuilder.create().uv(-2, -2).cuboid(-1.9F, -1.5F, -2.0F, 3.8F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.2803F, 0.8059F, -0.3054F, 0.0F, 0.0F));

		ModelPartData horn2 = spikeFeatures.addChild("horn2", ModelPartBuilder.create(), ModelTransform.of(13.0F, 9.0303F, -110.5559F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r270 = horn2.addChild("cube_r270", ModelPartBuilder.create().uv(0, 0).cuboid(-0.7F, -3.8F, -0.4F, 1.4F, 8.0F, 1.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -16.598F, 11.8735F, -0.9163F, 0.0F, 0.0F));

		ModelPartData cube_r271 = horn2.addChild("cube_r271", ModelPartBuilder.create().uv(-1, -1).cuboid(-1.2F, 0.5F, 2.6F, 2.4F, 8.0F, 2.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -16.8101F, 6.7116F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r272 = horn2.addChild("cube_r272", ModelPartBuilder.create().uv(-1, -1).cuboid(-1.5F, 0.0F, 0.2F, 3.0F, 6.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -9.1803F, 2.3059F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r273 = horn2.addChild("cube_r273", ModelPartBuilder.create().uv(-2, -2).cuboid(-1.9F, -1.5F, -2.0F, 3.8F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.2803F, 0.8059F, -0.3054F, 0.0F, 0.0F));

		ModelPartData horn3 = spikeFeatures.addChild("horn3", ModelPartBuilder.create(), ModelTransform.of(8.0F, 9.0303F, -113.5559F, 0.0F, 0.0F, 0.3927F));

		ModelPartData cube_r274 = horn3.addChild("cube_r274", ModelPartBuilder.create().uv(0, 0).cuboid(-0.7F, -11.8F, -0.4F, 1.4F, 8.0F, 1.4F, new Dilation(0.0F))
				.uv(-1, -1).cuboid(-1.2F, -3.8F, -0.9F, 2.4F, 8.0F, 2.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -16.598F, 11.8735F, -0.9163F, 0.0F, 0.0F));

		ModelPartData cube_r275 = horn3.addChild("cube_r275", ModelPartBuilder.create().uv(-2, -2).cuboid(-1.7F, 0.5F, 2.1F, 3.4F, 8.0F, 3.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -16.8101F, 6.7116F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r276 = horn3.addChild("cube_r276", ModelPartBuilder.create().uv(-2, -2).cuboid(-2.0F, 0.0F, -0.3F, 4.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -9.1803F, 2.3059F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r277 = horn3.addChild("cube_r277", ModelPartBuilder.create().uv(-3, -3).cuboid(-2.4F, -1.5F, -2.5F, 4.8F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.2803F, 0.8059F, -0.3054F, 0.0F, 0.0F));

		ModelPartData horn4 = spikeFeatures.addChild("horn4", ModelPartBuilder.create(), ModelTransform.of(-12.0F, 9.0303F, -114.5559F, 0.0F, 0.0F, -0.3927F));

		ModelPartData cube_r278 = horn4.addChild("cube_r278", ModelPartBuilder.create().uv(0, 0).cuboid(-0.7F, -11.8F, -0.4F, 1.4F, 8.0F, 1.4F, new Dilation(0.0F))
				.uv(-1, -1).cuboid(-1.2F, -3.8F, -0.9F, 2.4F, 8.0F, 2.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -16.598F, 11.8735F, -0.9163F, 0.0F, 0.0F));

		ModelPartData cube_r279 = horn4.addChild("cube_r279", ModelPartBuilder.create().uv(-2, -2).cuboid(-1.7F, 0.5F, 2.1F, 3.4F, 8.0F, 3.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -16.8101F, 6.7116F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r280 = horn4.addChild("cube_r280", ModelPartBuilder.create().uv(-2, -2).cuboid(-2.0F, 0.0F, -0.3F, 4.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -9.1803F, 2.3059F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r281 = horn4.addChild("cube_r281", ModelPartBuilder.create().uv(-3, -3).cuboid(-2.4F, -1.5F, -2.5F, 4.8F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.2803F, 0.8059F, -0.3054F, 0.0F, 0.0F));

		ModelPartData horn5 = spikeFeatures.addChild("horn5", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, 8.0303F, -117.5559F));

		ModelPartData cube_r282 = horn5.addChild("cube_r282", ModelPartBuilder.create().uv(0, 0).cuboid(-0.7F, -11.25F, -0.7F, 1.4F, 8.0F, 1.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -20.4995F, 17.4509F, -1.1345F, 0.0F, 0.0F));

		ModelPartData cube_r283 = horn5.addChild("cube_r283", ModelPartBuilder.create().uv(-1, -1).cuboid(-1.45F, -3.5F, -0.95F, 2.9F, 8.0F, 2.9F, new Dilation(0.0F)), ModelTransform.of(0.0F, -20.4995F, 17.4509F, -1.0472F, 0.0F, 0.0F));

		ModelPartData cube_r284 = horn5.addChild("cube_r284", ModelPartBuilder.create().uv(-2, -2).cuboid(-1.95F, -2.8F, -1.65F, 3.9F, 8.0F, 3.9F, new Dilation(0.0F)), ModelTransform.of(0.0F, -16.598F, 11.8735F, -0.9163F, 0.0F, 0.0F));

		ModelPartData cube_r285 = horn5.addChild("cube_r285", ModelPartBuilder.create().uv(-3, -3).cuboid(-2.45F, 0.9F, 1.35F, 4.9F, 8.0F, 4.9F, new Dilation(0.0F)), ModelTransform.of(0.0F, -16.8101F, 6.7116F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r286 = horn5.addChild("cube_r286", ModelPartBuilder.create().uv(-4, -4).cuboid(-2.75F, 0.0F, -1.05F, 5.5F, 6.0F, 5.5F, new Dilation(0.0F)), ModelTransform.of(0.0F, -9.1803F, 2.3059F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r287 = horn5.addChild("cube_r287", ModelPartBuilder.create().uv(-5, -5).cuboid(-3.15F, -1.5F, -3.25F, 6.3F, 5.0F, 6.5F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.2803F, 0.8059F, -0.3054F, 0.0F, 0.0F));

		ModelPartData horn6 = spikeFeatures.addChild("horn6", ModelPartBuilder.create(), ModelTransform.of(13.0F, 15.0303F, -117.5559F, 0.0F, 0.0F, 1.1781F));

		ModelPartData cube_r288 = horn6.addChild("cube_r288", ModelPartBuilder.create().uv(0, 0).cuboid(-0.7F, -11.25F, -0.7F, 1.4F, 8.0F, 1.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -20.4995F, 17.4509F, -1.1345F, 0.0F, 0.0F));

		ModelPartData cube_r289 = horn6.addChild("cube_r289", ModelPartBuilder.create().uv(-1, -1).cuboid(-1.45F, -3.5F, -0.95F, 2.9F, 8.0F, 2.9F, new Dilation(0.0F)), ModelTransform.of(0.0F, -20.4995F, 17.4509F, -1.0472F, 0.0F, 0.0F));

		ModelPartData cube_r290 = horn6.addChild("cube_r290", ModelPartBuilder.create().uv(-2, -2).cuboid(-1.95F, -2.8F, -1.65F, 3.9F, 8.0F, 3.9F, new Dilation(0.0F)), ModelTransform.of(0.0F, -16.598F, 11.8735F, -0.9163F, 0.0F, 0.0F));

		ModelPartData cube_r291 = horn6.addChild("cube_r291", ModelPartBuilder.create().uv(-3, -3).cuboid(-2.45F, 0.9F, 1.35F, 4.9F, 8.0F, 4.9F, new Dilation(0.0F)), ModelTransform.of(0.0F, -16.8101F, 6.7116F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r292 = horn6.addChild("cube_r292", ModelPartBuilder.create().uv(-4, -4).cuboid(-2.75F, 0.0F, -1.05F, 5.5F, 6.0F, 5.5F, new Dilation(0.0F)), ModelTransform.of(0.0F, -9.1803F, 2.3059F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r293 = horn6.addChild("cube_r293", ModelPartBuilder.create().uv(-5, -5).cuboid(-3.15F, -1.5F, -3.25F, 6.3F, 5.0F, 6.5F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.2803F, 0.8059F, -0.3054F, 0.0F, 0.0F));

		ModelPartData horn8 = spikeFeatures.addChild("horn8", ModelPartBuilder.create(), ModelTransform.of(-18.0F, 15.0303F, -117.5559F, 0.0F, 0.0F, -1.1781F));

		ModelPartData cube_r294 = horn8.addChild("cube_r294", ModelPartBuilder.create().uv(0, 0).cuboid(-0.7F, -11.25F, -0.7F, 1.4F, 8.0F, 1.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -20.4995F, 17.4509F, -1.1345F, 0.0F, 0.0F));

		ModelPartData cube_r295 = horn8.addChild("cube_r295", ModelPartBuilder.create().uv(-1, -1).cuboid(-1.45F, -3.5F, -0.95F, 2.9F, 8.0F, 2.9F, new Dilation(0.0F)), ModelTransform.of(0.0F, -20.4995F, 17.4509F, -1.0472F, 0.0F, 0.0F));

		ModelPartData cube_r296 = horn8.addChild("cube_r296", ModelPartBuilder.create().uv(-2, -2).cuboid(-1.95F, -2.8F, -1.65F, 3.9F, 8.0F, 3.9F, new Dilation(0.0F)), ModelTransform.of(0.0F, -16.598F, 11.8735F, -0.9163F, 0.0F, 0.0F));

		ModelPartData cube_r297 = horn8.addChild("cube_r297", ModelPartBuilder.create().uv(-3, -3).cuboid(-2.45F, 0.9F, 1.35F, 4.9F, 8.0F, 4.9F, new Dilation(0.0F)), ModelTransform.of(0.0F, -16.8101F, 6.7116F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r298 = horn8.addChild("cube_r298", ModelPartBuilder.create().uv(-4, -4).cuboid(-2.75F, 0.0F, -1.05F, 5.5F, 6.0F, 5.5F, new Dilation(0.0F)), ModelTransform.of(0.0F, -9.1803F, 2.3059F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r299 = horn8.addChild("cube_r299", ModelPartBuilder.create().uv(-5, -5).cuboid(-3.15F, -1.5F, -3.25F, 6.3F, 5.0F, 6.5F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.2803F, 0.8059F, -0.3054F, 0.0F, 0.0F));

		ModelPartData horn7 = spikeFeatures.addChild("horn7", ModelPartBuilder.create(), ModelTransform.of(13.0F, 22.0303F, -117.5559F, 0.0F, 0.0F, 1.5708F));

		ModelPartData cube_r300 = horn7.addChild("cube_r300", ModelPartBuilder.create().uv(0, 0).cuboid(-0.7F, -11.25F, -0.7F, 1.4F, 8.0F, 1.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -20.4995F, 17.4509F, -1.1345F, 0.0F, 0.0F));

		ModelPartData cube_r301 = horn7.addChild("cube_r301", ModelPartBuilder.create().uv(-1, -1).cuboid(-1.45F, -3.5F, -0.95F, 2.9F, 8.0F, 2.9F, new Dilation(0.0F)), ModelTransform.of(0.0F, -20.4995F, 17.4509F, -1.0472F, 0.0F, 0.0F));

		ModelPartData cube_r302 = horn7.addChild("cube_r302", ModelPartBuilder.create().uv(-2, -2).cuboid(-1.95F, -2.8F, -1.65F, 3.9F, 8.0F, 3.9F, new Dilation(0.0F)), ModelTransform.of(0.0F, -16.598F, 11.8735F, -0.9163F, 0.0F, 0.0F));

		ModelPartData cube_r303 = horn7.addChild("cube_r303", ModelPartBuilder.create().uv(-3, -3).cuboid(-2.45F, 0.9F, 1.35F, 4.9F, 8.0F, 4.9F, new Dilation(0.0F)), ModelTransform.of(0.0F, -16.8101F, 6.7116F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r304 = horn7.addChild("cube_r304", ModelPartBuilder.create().uv(-4, -4).cuboid(-2.75F, 0.0F, -1.05F, 5.5F, 6.0F, 5.5F, new Dilation(0.0F)), ModelTransform.of(0.0F, -9.1803F, 2.3059F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r305 = horn7.addChild("cube_r305", ModelPartBuilder.create().uv(-5, -5).cuboid(-3.15F, -1.5F, -3.25F, 6.3F, 5.0F, 6.5F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.2803F, 0.8059F, -0.3054F, 0.0F, 0.0F));

		ModelPartData horn9 = spikeFeatures.addChild("horn9", ModelPartBuilder.create(), ModelTransform.of(-19.0F, 22.0303F, -117.5559F, 0.0F, 0.0F, -1.5708F));

		ModelPartData cube_r306 = horn9.addChild("cube_r306", ModelPartBuilder.create().uv(0, 0).cuboid(-0.7F, -11.25F, -0.7F, 1.4F, 8.0F, 1.4F, new Dilation(0.0F)), ModelTransform.of(0.0F, -20.4995F, 17.4509F, -1.1345F, 0.0F, 0.0F));

		ModelPartData cube_r307 = horn9.addChild("cube_r307", ModelPartBuilder.create().uv(-1, -1).cuboid(-1.45F, -3.5F, -0.95F, 2.9F, 8.0F, 2.9F, new Dilation(0.0F)), ModelTransform.of(0.0F, -20.4995F, 17.4509F, -1.0472F, 0.0F, 0.0F));

		ModelPartData cube_r308 = horn9.addChild("cube_r308", ModelPartBuilder.create().uv(-2, -2).cuboid(-1.95F, -2.8F, -1.65F, 3.9F, 8.0F, 3.9F, new Dilation(0.0F)), ModelTransform.of(0.0F, -16.598F, 11.8735F, -0.9163F, 0.0F, 0.0F));

		ModelPartData cube_r309 = horn9.addChild("cube_r309", ModelPartBuilder.create().uv(-3, -3).cuboid(-2.45F, 0.9F, 1.35F, 4.9F, 8.0F, 4.9F, new Dilation(0.0F)), ModelTransform.of(0.0F, -16.8101F, 6.7116F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r310 = horn9.addChild("cube_r310", ModelPartBuilder.create().uv(-4, -4).cuboid(-2.75F, 0.0F, -1.05F, 5.5F, 6.0F, 5.5F, new Dilation(0.0F)), ModelTransform.of(0.0F, -9.1803F, 2.3059F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r311 = horn9.addChild("cube_r311", ModelPartBuilder.create().uv(-5, -5).cuboid(-3.15F, -1.5F, -3.25F, 6.3F, 5.0F, 6.5F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.2803F, 0.8059F, -0.3054F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 1024, 1024);
	}
	@Override
	public void setAngles(SelinofosEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}